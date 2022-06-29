package br.com.koruthos.atividade2.model;

import br.com.koruthos.atividade2.observer.impl.OnEmergenciaObserver;
import br.com.koruthos.atividade2.observer.impl.OnManutencaoObserver;

public class ElevadorPassageiros extends AbstractElevador {
    public ElevadorPassageiros() {
        mContext.adicionar(new OnEmergenciaObserver(this));
        mContext.adicionar(new OnManutencaoObserver(this));
    }
}
