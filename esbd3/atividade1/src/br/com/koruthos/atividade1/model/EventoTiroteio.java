package br.com.koruthos.atividade1.model;

public class EventoTiroteio extends Evento {
    public EventoTiroteio(final Coordenada coordenada) {
        super(coordenada, TipoSeguranca.PERIGO_ALTO);
    }
}
