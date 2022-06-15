package br.com.koruthos.atividade1.model;

public class Endereco {
    private final Coordenada mInicio;
    private final Coordenada mFim;

    private final String mLogradouro;
    private final int mNumeroMin;
    private final int mNumeroMax;

    private TipoSeguranca mTipoSeguranca;

    public Endereco(final Coordenada inicio, final Coordenada fim, final String logradouro, final int numeroMax, final int numeroMin, final TipoSeguranca tipoSeguranca) {
        mInicio = inicio;
        mFim = fim;
        mLogradouro = logradouro;
        mNumeroMin = numeroMax;
        mNumeroMax = numeroMin;
        mTipoSeguranca = tipoSeguranca;
    }

    public String getLogradouro() {
        return mLogradouro;
    }

    public Coordenada getCoordInicio() {
        return mInicio;
    }

    public Coordenada getCoordFim() {
        return mFim;
    }

    public int getNumeroMin() {
        return mNumeroMin;
    }

    public int getNumeroMax() {
        return mNumeroMax;
    }

    public TipoSeguranca getSeguranca() {
        return mTipoSeguranca;
    }

    public void setSeguranca(final TipoSeguranca tipoSeguranca) {
        mTipoSeguranca = tipoSeguranca;
    }
}
