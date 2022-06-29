package br.com.koruthos.atividade2.observer.impl;

import br.com.koruthos.atividade2.model.Elevador;
import br.com.koruthos.atividade2.observer.ElevadorObserver;
import br.com.koruthos.atividade2.state.ElevadorState;
import br.com.koruthos.atividade2.state.impl.ElevadorEmEmergenciaState;
import br.com.koruthos.atividade2.state.impl.ElevadorEmManutencaoState;

public class OnManutencaoObserver implements ElevadorObserver {

    private final Elevador mElevador;

    public OnManutencaoObserver(Elevador elevador) {
        mElevador = elevador;
    }

    @Override
    public ElevadorState getEstado() {
        return ElevadorEmManutencaoState.getInstance();
    }

    @Override
    public void atualizarEstado() {
        try {
            System.out.println("> Iniciando conserto...");
            Thread.sleep(3000);
            mElevador.parar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
