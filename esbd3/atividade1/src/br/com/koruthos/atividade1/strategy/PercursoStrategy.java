package br.com.koruthos.atividade1.strategy;

import br.com.koruthos.atividade1.model.Coordenada;
import br.com.koruthos.atividade1.model.Endereco;
import br.com.koruthos.atividade1.model.Mapa;

import java.util.List;

public interface PercursoStrategy {
    List<Endereco> calcularPercurso(final Coordenada origem, final Coordenada destino, final Mapa mapa);
}
