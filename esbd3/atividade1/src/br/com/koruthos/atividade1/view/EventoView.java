package br.com.koruthos.atividade1.view;

import br.com.koruthos.atividade1.controller.EventoController;
import br.com.koruthos.atividade1.model.Coordenada;
import br.com.koruthos.atividade1.model.EventoAssalto;
import br.com.koruthos.atividade1.model.EventoRoubo;
import br.com.koruthos.atividade1.model.EventoTiroteio;

import java.util.Scanner;

public class EventoView {
    private final EventoController mController;

    public EventoView(final EventoController controller) {
        mController = controller;
    }

    public void exibirTelaPrincipal() {
        Scanner teclado = new Scanner(System.in);
        boolean terminou = false;

        while (!terminou) {
            System.out.println();
            System.out.println("=====================");
            System.out.println("= Gerenciar Eventos =");
            System.out.println("=====================");
            System.out.println("1. Cadastrar novo evento");
            System.out.println("3. Sair");
            System.out.print(">: ");

            int opcao = teclado.nextInt();
            switch (opcao) {
                case 1 -> cadastrarEvento();
                case 3 -> terminou = true;
            }
        }
    }

    private void cadastrarEvento() {
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("- 1) Cadastrar evento -");
        System.out.println("-----------------------");

        Scanner teclado = new Scanner(System.in);
        System.out.println("- Digite o coordenadas do evento: ");
        Coordenada coordenada = new Coordenada(teclado.nextDouble(), teclado.nextDouble());

        System.out.println("- Escolha o tipo do evento: (0) Roubo, (1) Assalto, (2) Tiroteio");
        switch (teclado.nextInt()) {
            case 0 -> mController.adicionarEvento(new EventoRoubo(coordenada));
            case 1 -> mController.adicionarEvento(new EventoAssalto(coordenada));
            case 2 -> mController.adicionarEvento(new EventoTiroteio(coordenada));
            default -> {
                System.out.println("- Evento inválido!!!");
            }
        }
    }
}
