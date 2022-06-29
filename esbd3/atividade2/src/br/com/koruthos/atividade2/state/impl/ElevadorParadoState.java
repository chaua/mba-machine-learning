package br.com.koruthos.atividade2.state.impl;

import br.com.koruthos.atividade2.state.ElevadorContext;
import br.com.koruthos.atividade2.state.ElevadorState;

public class ElevadorParadoState implements ElevadorState {

    private static ElevadorParadoState sInstance;

    private ElevadorParadoState() {
        //vazio
    }

    public static ElevadorState getInstance() {
        if (sInstance == null) {
            sInstance = new ElevadorParadoState();
        }
        return sInstance;
    }

    @Override
    public void pressionarBotaoSubir(final ElevadorContext context) {
        System.out.println(">> Subindo!");
        context.setEstadoAtual(ElevadorSubindoState.getInstance());
    }

    @Override
    public void pressionarBotaoDescer(final ElevadorContext context) {
        System.out.println(">> Descendo!");
        context.setEstadoAtual(ElevadorDescendoState.getInstance());
    }

    @Override
    public void pressionarBotaoEmergencia(final ElevadorContext context) {
        System.out.println(">> Acionando emergência!");
        context.setEstadoAtual(ElevadorEmEmergenciaState.getInstance());
    }

    @Override
    public void parar(final ElevadorContext context) {
        System.out.println("!! Elevador já está parado");
    }

    @Override
    public void consertar(final ElevadorContext context) {
        System.out.println("!! Elevador já está consertado");
    }
}
