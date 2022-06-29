package br.com.koruthos.atividade2.state;

import br.com.koruthos.atividade2.model.Elevador;
import br.com.koruthos.atividade2.observer.ElevadorSubject;
import br.com.koruthos.atividade2.state.impl.ElevadorEmEmergenciaState;
import br.com.koruthos.atividade2.state.impl.ElevadorEmManutencaoState;
import br.com.koruthos.atividade2.state.impl.ElevadorParadoState;

public class ElevadorContext extends ElevadorSubject {

    private ElevadorState mEstadoAtual;

    public ElevadorContext() {
        // Inicialmente o elevador está parado
        mEstadoAtual = ElevadorParadoState.getInstance();
    }

    public ElevadorState getEstadoAtual() {
        return mEstadoAtual;
    }

    public void setEstadoAtual(final ElevadorState estadoAtual) {
        mEstadoAtual = estadoAtual;
    }

    public void subir() {
        mEstadoAtual.pressionarBotaoSubir(this);
    }

    public void descer() {
        mEstadoAtual.pressionarBotaoDescer(this);
    }

    public void parar() {
        mEstadoAtual.parar(this);
        notificar(ElevadorParadoState.getInstance());
    }

    public void quebrar() {
        mEstadoAtual.pressionarBotaoEmergencia(this);
        notificar(ElevadorEmEmergenciaState.getInstance());
    }

    public void consertar() {
        mEstadoAtual.consertar(this);
        notificar(ElevadorEmManutencaoState.getInstance());
    }

}
