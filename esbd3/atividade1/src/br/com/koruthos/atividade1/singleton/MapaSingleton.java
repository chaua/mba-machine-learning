package br.com.koruthos.atividade1.singleton;

import br.com.koruthos.atividade1.dao.MapaDAO;
import br.com.koruthos.atividade1.model.Mapa;

public class MapaSingleton {

    private static Mapa sMapa;

    private MapaSingleton() {
        // vazio
    }

    public static Mapa getInstance() {
        if (sMapa == null) {
            MapaDAO dao = new MapaDAO();
            sMapa = dao.carregarMapa();
        }
        return sMapa;
    }

}
