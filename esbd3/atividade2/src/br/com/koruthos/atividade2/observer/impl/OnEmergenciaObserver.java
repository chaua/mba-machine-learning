package br.com.koruthos.atividade2.observer.impl;

import br.com.koruthos.atividade2.model.Elevador;
import br.com.koruthos.atividade2.observer.ElevadorObserver;
import br.com.koruthos.atividade2.state.ElevadorState;
import br.com.koruthos.atividade2.state.impl.ElevadorEmEmergenciaState;

public class OnEmergenciaObserver implements ElevadorObserver {

    private final Elevador mElevador;

    public OnEmergenciaObserver(Elevador elevador) {
        mElevador = elevador;
    }

    @Override
    public ElevadorState getEstado() {
        return ElevadorEmEmergenciaState.getInstance();
    }

    @Override
    public void atualizarEstado() {
        System.out.println("> Entrando em modo de emergência!");
        mElevador.acionarServicoManutencao();
        mElevador.tocarMusica();
    }
}
