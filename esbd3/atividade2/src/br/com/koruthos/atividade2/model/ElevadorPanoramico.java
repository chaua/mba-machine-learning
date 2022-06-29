package br.com.koruthos.atividade2.model;

import br.com.koruthos.atividade2.observer.impl.OnEmergenciaObserver;
import br.com.koruthos.atividade2.observer.impl.OnManutencaoObserver;
import br.com.koruthos.atividade2.observer.impl.OnParandoObserver;

public class ElevadorPanoramico extends AbstractElevador {
    public ElevadorPanoramico() {
        mContext.adicionar(new OnEmergenciaObserver(this));
        mContext.adicionar(new OnManutencaoObserver(this));
        mContext.adicionar(new OnParandoObserver(this));
    }
}
