package br.com.koruthos.atividade1.model;

public abstract class Evento {

    private final Coordenada mCoordenada;
    private final TipoSeguranca mSeguranca;

    public Evento(final Coordenada coordenada, final TipoSeguranca seguranca) {
        mCoordenada = coordenada;
        mSeguranca = seguranca;
    }

    public Coordenada getCoordenada() {
        return mCoordenada;
    }

    public TipoSeguranca getSeguranca() {
        return mSeguranca;
    }

}
