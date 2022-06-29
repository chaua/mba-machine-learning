package br.com.koruthos.atividade2.observer;

import br.com.koruthos.atividade2.state.ElevadorState;

public interface ElevadorObserver {
    ElevadorState getEstado();
    void atualizarEstado();
}
