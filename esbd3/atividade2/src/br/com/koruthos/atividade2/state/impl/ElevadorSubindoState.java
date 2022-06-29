package br.com.koruthos.atividade2.state.impl;

import br.com.koruthos.atividade2.state.ElevadorContext;
import br.com.koruthos.atividade2.state.ElevadorState;

public class ElevadorSubindoState implements ElevadorState {

    private static ElevadorSubindoState sInstance;

    private ElevadorSubindoState() {
        //vazio
    }

    public static ElevadorState getInstance() {
        if (sInstance == null) {
            sInstance = new ElevadorSubindoState();
        }
        return sInstance;
    }

    @Override
    public void pressionarBotaoSubir(final ElevadorContext context) {
        System.out.println("!! Elevador já está em movimento");
    }

    @Override
    public void pressionarBotaoDescer(final ElevadorContext context) {
        System.out.println("!! Elevador já está em movimento");
    }

    @Override
    public void pressionarBotaoEmergencia(final ElevadorContext context) {
        System.out.println(">> Acionando emergência!");
        context.setEstadoAtual(ElevadorEmEmergenciaState.getInstance());
    }

    @Override
    public void parar(final ElevadorContext context) {
        System.out.println(">> Elevador parou!");
        context.setEstadoAtual(ElevadorParadoState.getInstance());
    }

    @Override
    public void consertar(final ElevadorContext context) {
        System.out.println("!! Elevador já está consertado");
    }
}
