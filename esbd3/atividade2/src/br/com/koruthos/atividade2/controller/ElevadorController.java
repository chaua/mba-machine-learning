package br.com.koruthos.atividade2.controller;

import br.com.koruthos.atividade2.model.Elevador;
import br.com.koruthos.atividade2.model.ElevadorCarga;
import br.com.koruthos.atividade2.model.ElevadorPanoramico;

public class ElevadorController {

    public void simular() {
        System.out.println("=== Carga ===");
        Elevador elevador = new ElevadorCarga();
        elevador.subir();
        elevador.parar();
        elevador.descer();
        elevador.subir(); // Erro!
        elevador.quebrar();
        elevador.subir(); // Erro!
        elevador.descer(); // Erro!
        elevador.consertar();
        elevador.descer();

        System.out.println();
        System.out.println("=== Panorâmico ===");
        elevador = new ElevadorPanoramico();
        elevador.subir();
        elevador.parar();
        elevador.descer();
        elevador.subir(); // Erro!
        elevador.quebrar();
        elevador.subir(); // Erro!
        elevador.consertar();
        elevador.descer();

    }
}
