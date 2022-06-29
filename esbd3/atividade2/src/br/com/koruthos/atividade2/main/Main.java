package br.com.koruthos.atividade2.main;

import br.com.koruthos.atividade2.controller.ElevadorController;

public class Main {
    public static void main(String[] args) {
        ElevadorController controller = new ElevadorController();
        controller.simular();
    }
}
