package br.com.koruthos.atividade2.state.impl;

import br.com.koruthos.atividade2.state.ElevadorContext;
import br.com.koruthos.atividade2.state.ElevadorState;

public class ElevadorEmManutencaoState implements ElevadorState {

    private static ElevadorEmManutencaoState sInstance;

    private ElevadorEmManutencaoState() {
        //vazio
    }

    public static ElevadorState getInstance() {
        if (sInstance == null) {
            sInstance = new ElevadorEmManutencaoState();
        }
        return sInstance;
    }

    @Override
    public void pressionarBotaoSubir(final ElevadorContext context) {
        System.out.println("!! Elevador está em manutenção");
    }

    @Override
    public void pressionarBotaoDescer(final ElevadorContext context) {
        System.out.println("!! Elevador está em manutenção");
    }

    @Override
    public void pressionarBotaoEmergencia(final ElevadorContext context) {
        System.out.println("!! Elevador está em manutenção");
    }

    @Override
    public void parar(final ElevadorContext context) {
        System.out.println(">> Elevador consertado com sucesso!");
        context.setEstadoAtual(ElevadorParadoState.getInstance());
    }

    @Override
    public void consertar(final ElevadorContext context) {
        System.out.println("!! Elevador está em manutenção");
    }
}
