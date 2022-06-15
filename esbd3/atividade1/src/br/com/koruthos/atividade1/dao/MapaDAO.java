package br.com.koruthos.atividade1.dao;

import br.com.koruthos.atividade1.model.Mapa;

public class MapaDAO {

    public Mapa carregarMapa() {
        // TODO: conectar no banco de dados
        // TODO: carregar todos endereços e constuir o grafo
        System.out.println(">> Construindo mapa a partir do banco de dados...");
        return new Mapa();
    }
}
