package br.com.koruthos.atividade1.controller;

import br.com.koruthos.atividade1.model.Evento;
import br.com.koruthos.atividade1.model.Mapa;
import br.com.koruthos.atividade1.singleton.MapaSingleton;
import br.com.koruthos.atividade1.view.EventoView;

public class EventoController {
    private final Mapa mMapa = MapaSingleton.getInstance();
    private final EventoView mView = new EventoView(this);

    public void executar() {
        mView.exibirTelaPrincipal();
    }

    public void adicionarEvento(final Evento evento) {
        mMapa.atualizarEndereco(evento.getCoordenada(), evento.getSeguranca());
    }
}
