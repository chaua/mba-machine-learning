package br.com.koruthos.atividade1.model;

public class EventoAssalto extends Evento {
    public EventoAssalto(final Coordenada coordenada) {
        super(coordenada, TipoSeguranca.PERIGO_ALTO);
    }
}
