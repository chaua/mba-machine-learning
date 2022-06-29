package br.com.koruthos.atividade2.observer;

import br.com.koruthos.atividade2.state.ElevadorState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ElevadorSubject {
    private final Map<ElevadorState, List<ElevadorObserver>> mObservadores = new HashMap<>();

    public void adicionar(ElevadorObserver observador) {
        if (!mObservadores.containsKey(observador.getEstado())) {
            mObservadores.put(observador.getEstado(), new ArrayList<>());
        }
        mObservadores.get(observador.getEstado()).add(observador);
    }

    public void remover(ElevadorObserver observador) {
        if (mObservadores.containsKey(observador.getEstado())) {
            mObservadores.get(observador.getEstado()).remove(observador);
        }
    }

    protected void notificar(ElevadorState estado) {
        if (mObservadores.containsKey(estado)) {
            for (ElevadorObserver observador : mObservadores.get(estado)) {
                observador.atualizarEstado();
            }
        }
    }
}
