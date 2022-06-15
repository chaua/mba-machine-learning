package br.com.koruthos.atividade1.strategy;

import br.com.koruthos.atividade1.model.Coordenada;
import br.com.koruthos.atividade1.model.Endereco;
import br.com.koruthos.atividade1.model.Mapa;

import java.util.ArrayList;
import java.util.List;

public class PercursoNormal implements PercursoStrategy {
    @Override
    public List<Endereco> calcularPercurso(final Coordenada origem, final Coordenada destino, final Mapa mapa) {
        // TODO: Implementar busca no grafo considerando distância e segurança
        System.out.println(">> Calculando a rota segura e distância aceitável");
        return new ArrayList<>();
    }
}
