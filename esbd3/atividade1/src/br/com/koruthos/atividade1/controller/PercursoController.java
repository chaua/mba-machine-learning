package br.com.koruthos.atividade1.controller;

import br.com.koruthos.atividade1.model.Coordenada;
import br.com.koruthos.atividade1.model.Endereco;
import br.com.koruthos.atividade1.model.Mapa;
import br.com.koruthos.atividade1.model.TipoPercurso;
import br.com.koruthos.atividade1.observer.MapaObserver;
import br.com.koruthos.atividade1.singleton.MapaSingleton;
import br.com.koruthos.atividade1.strategy.PercursoCurto;
import br.com.koruthos.atividade1.strategy.PercursoNormal;
import br.com.koruthos.atividade1.strategy.PercursoSeguro;
import br.com.koruthos.atividade1.strategy.PercursoStrategy;
import br.com.koruthos.atividade1.view.PercursoView;

import java.util.List;

public class PercursoController implements MapaObserver {
    private final Mapa mMapa = MapaSingleton.getInstance();
    private final PercursoView mView = new PercursoView(this);

    private Coordenada mOrigem = new Coordenada();
    private Coordenada mDestino = new Coordenada();

    private PercursoStrategy mStrategy = new PercursoNormal();

    public PercursoController() {
        mMapa.registrarObservador(this);
    }

    public void executar() {
        mView.exibirTelaPrincipal();
    }

    public void setOrigem(final Coordenada origem) {
        mOrigem = origem;
    }

    public void setDestino(final Coordenada destino) {
        mDestino = destino;
    }

    public void setTipoPercurso(final TipoPercurso tipo) {
        switch (tipo) {
            case CURTO -> mStrategy = new PercursoCurto();
            case NORMAL -> mStrategy = new PercursoNormal();
            case SEGURO -> mStrategy = new PercursoSeguro();
        }
    }

    public List<Endereco> calcularPercurso() {
        return mStrategy.calcularPercurso(mOrigem, mDestino, mMapa);
    }

    @Override
    public void onMapaUpdate() {
        mView.exibirTelaAtualizacaoPercurso();
    }
}
