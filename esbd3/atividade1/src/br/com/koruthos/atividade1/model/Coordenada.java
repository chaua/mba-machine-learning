package br.com.koruthos.atividade1.model;

public class Coordenada {
    private double mLatitude;
    private double mLongitude;

    public Coordenada() {
        this(0, 0);
    }

    public Coordenada(double latitude, double longitude) {
        this.mLatitude = mLatitude;
        this.mLongitude = mLongitude;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public double getLongitude() {
        return mLongitude;
    }
}
