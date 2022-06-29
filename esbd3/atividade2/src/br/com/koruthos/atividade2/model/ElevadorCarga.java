package br.com.koruthos.atividade2.model;

import br.com.koruthos.atividade2.observer.impl.OnEmergenciaObserver;
import br.com.koruthos.atividade2.observer.impl.OnManutencaoObserver;

public class ElevadorCarga extends AbstractElevador {
    public ElevadorCarga() {
        mContext.adicionar(new OnEmergenciaObserver(this));
        mContext.adicionar(new OnManutencaoObserver(this));
    }
}
