package br.com.koruthos.atividade2.model;

import br.com.koruthos.atividade2.state.ElevadorContext;

public abstract class AbstractElevador implements Elevador {

    protected final ElevadorContext mContext = new ElevadorContext();

    private int mAndar = 0;

    public void subir() {
        mContext.subir();
        mAndar++;
    }

    public void descer() {
        mContext.descer();
        mAndar--;
    }

    public void parar() {
        mContext.parar();
    }

    public void quebrar() {
        mContext.quebrar();
    }

    public void consertar() {
        mContext.consertar();
    }

    public void acionarServicoManutencao() {
        System.out.println("Acionando equipe de manutenção...");
    }

    public void tocarMusica() {
        System.out.println("Tocando música agradável...");
    }

    public void avisarPassageiros() {
        System.out.println("Avisando passageiros que chegou ao andar.");
    }
}
