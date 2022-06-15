package br.com.koruthos.atividade1.model;

public class EventoRoubo extends Evento {
    public EventoRoubo(final Coordenada coordenada) {
        super(coordenada, TipoSeguranca.PERIGO_MEDIO);
    }
}
