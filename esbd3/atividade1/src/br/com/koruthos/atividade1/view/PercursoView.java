package br.com.koruthos.atividade1.view;

import br.com.koruthos.atividade1.controller.PercursoController;
import br.com.koruthos.atividade1.model.Coordenada;
import br.com.koruthos.atividade1.model.Endereco;
import br.com.koruthos.atividade1.model.TipoPercurso;

import java.util.List;
import java.util.Scanner;

public class PercursoView {
    private final PercursoController mController;

    public PercursoView(PercursoController controller) {
        mController = controller;
    }

    public void exibirTelaPrincipal() {
        Scanner teclado = new Scanner(System.in);
        boolean terminou = false;

        while (!terminou) {
            System.out.println();
            System.out.println("======================");
            System.out.println("= Gerenciar Percurso =");
            System.out.println("======================");
            System.out.println("1. Cadastrar origem e destino");
            System.out.println("2. Visualizar percurso");
            System.out.println("3. Sair");
            System.out.print(">: ");

            int opcao = teclado.nextInt();
            switch (opcao) {
                case 1 -> cadastrarOrigemDestino();
                case 2 -> exibirTelaPercurso();
                case 3 -> terminou = true;
            }
        }
    }

    private void cadastrarOrigemDestino() {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("- 1) Cadastrar percurso -");
        System.out.println("-------------------------");

        Scanner teclado = new Scanner(System.in);
        System.out.println("- Digite as coordenadas de origem: ");
        Coordenada origem = new Coordenada(teclado.nextDouble(), teclado.nextDouble());
        mController.setOrigem(origem);

        System.out.println("- Digite as coordenadas de destino: ");
        Coordenada destino = new Coordenada(teclado.nextDouble(), teclado.nextDouble());
        mController.setDestino(destino);

        System.out.println("- Escolha o tipo de percurso: (0) Mais curto, (1) Normal, (2) Mais seguro ");
        switch (teclado.nextInt()) {
            case 0 -> mController.setTipoPercurso(TipoPercurso.CURTO);
            case 1 -> mController.setTipoPercurso(TipoPercurso.NORMAL);
            case 2 -> mController.setTipoPercurso(TipoPercurso.SEGURO);
            default -> {
                System.out.println("- Selecionando percurso normal...");
                mController.setTipoPercurso(TipoPercurso.NORMAL);
            }
        }
    }

    public void exibirTelaPercurso() {
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("- 2) Visualizar Percurso -");
        System.out.println("--------------------------");

        List<Endereco> percurso = mController.calcularPercurso();
        for (Endereco endereco : percurso) {
            System.out.println(endereco.getLogradouro());
        }
    }

    public void exibirTelaAtualizacaoPercurso() {
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("- !! Percurso Atualizado !! -");
        System.out.println("-----------------------------");

        List<Endereco> percurso = mController.calcularPercurso();
        for (Endereco endereco : percurso) {
            System.out.println(endereco.getLogradouro());
        }
    }

}
