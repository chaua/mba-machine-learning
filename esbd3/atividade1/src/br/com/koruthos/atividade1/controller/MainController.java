package br.com.koruthos.atividade1.controller;

import br.com.koruthos.atividade1.view.MainView;

public class MainController {
    private final MainView mView = new MainView(this);
    private final EventoController mEventoController = new EventoController();
    private final PercursoController mPercursoController = new PercursoController();

    public void executar() {
        mView.exibirTelaPrincipal();
    }

    public void gerenciarPercurso() {
        mPercursoController.executar();
    }

    public void gerenciarEvento() {
        mEventoController.executar();
    }
}
