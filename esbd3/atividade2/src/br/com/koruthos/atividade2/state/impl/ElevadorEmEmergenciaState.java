package br.com.koruthos.atividade2.state.impl;

import br.com.koruthos.atividade2.state.ElevadorContext;
import br.com.koruthos.atividade2.state.ElevadorState;

public class ElevadorEmEmergenciaState implements ElevadorState {

    private static ElevadorEmEmergenciaState sInstance;

    private ElevadorEmEmergenciaState() {
        //vazio
    }

    public static ElevadorState getInstance() {
        if (sInstance == null) {
            sInstance = new ElevadorEmEmergenciaState();
        }
        return sInstance;
    }

    @Override
    public void pressionarBotaoSubir(final ElevadorContext context) {
        System.out.println("!! Elevador está quebrado.");
    }

    @Override
    public void pressionarBotaoDescer(final ElevadorContext context) {
        System.out.println("!! Elevador está quebrado.");
    }

    @Override
    public void pressionarBotaoEmergencia(final ElevadorContext context) {
        System.out.println("!! Elevador está em manutenção");
    }

    @Override
    public void parar(final ElevadorContext context) {
        System.out.println(">> Elevador parou!");
        context.setEstadoAtual(ElevadorParadoState.getInstance());
    }

    @Override
    public void consertar(final ElevadorContext context) {
        System.out.println(">> Elevador entrando em manutenção!");
        context.setEstadoAtual(ElevadorEmManutencaoState.getInstance());
    }
}
