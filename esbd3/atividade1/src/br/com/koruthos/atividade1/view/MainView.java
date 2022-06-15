package br.com.koruthos.atividade1.view;

import br.com.koruthos.atividade1.controller.MainController;

import java.util.Scanner;

public class MainView {
    private final MainController mController;

    public MainView(final MainController controller) {
        mController = controller;
    }

    public void exibirTelaPrincipal() {
        Scanner teclado = new Scanner(System.in);
        boolean terminou = false;

        while (!terminou) {
            System.out.println();
            System.out.println("====================");
            System.out.println("= Painel Principal =");
            System.out.println("====================");
            System.out.println("1. Gerenciar percurso");
            System.out.println("2. Gerenciar eventos");
            System.out.println("3. Sair");
            System.out.print(">: ");

            int opcao = teclado.nextInt();
            switch (opcao) {
                case 1 -> mController.gerenciarPercurso();
                case 2 -> mController.gerenciarEvento();
                case 3 -> terminou = true;
            }
        }
    }
}
