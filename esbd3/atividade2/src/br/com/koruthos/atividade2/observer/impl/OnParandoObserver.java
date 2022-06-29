package br.com.koruthos.atividade2.observer.impl;

import br.com.koruthos.atividade2.model.Elevador;
import br.com.koruthos.atividade2.observer.ElevadorObserver;
import br.com.koruthos.atividade2.state.ElevadorState;
import br.com.koruthos.atividade2.state.impl.ElevadorEmEmergenciaState;
import br.com.koruthos.atividade2.state.impl.ElevadorParadoState;

public class OnParandoObserver implements ElevadorObserver {

    private final Elevador mElevador;

    public OnParandoObserver(Elevador elevador) {
        mElevador = elevador;
    }

    @Override
    public ElevadorState getEstado() {
        return ElevadorParadoState.getInstance();
    }

    @Override
    public void atualizarEstado() {
        mElevador.avisarPassageiros();
    }
}
