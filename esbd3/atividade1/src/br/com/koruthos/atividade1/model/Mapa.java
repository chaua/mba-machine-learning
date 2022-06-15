package br.com.koruthos.atividade1.model;

import br.com.koruthos.atividade1.observer.MapaObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapa {

    private final Map<Coordenada, List<Endereco>> mGrafo;
    private final List<Endereco> mEnderecos;
    private final List<MapaObserver> mObservadores;

    public Mapa() {
        mGrafo = new HashMap<>();
        mEnderecos = new ArrayList<>();
        mObservadores = new ArrayList<>();
    }

    public void adicionarEndereco(final Endereco endereco) {
        addAresta(endereco.getCoordInicio(), endereco);
        addAresta(endereco.getCoordFim(), endereco);
        notificarObservadores();
    }

    private void addAresta(final Coordenada coordenada, final Endereco endereco) {
        if (mGrafo.containsKey(coordenada)) {
            mGrafo.get(coordenada).add(endereco);
        } else {
            List<Endereco> enderecos = new ArrayList<>();
            enderecos.add(endereco);
            mGrafo.put(coordenada, enderecos);
        }
    }

    private void notificarObservadores() {
        for (MapaObserver observador : mObservadores) {
            observador.onMapaUpdate();
        }
    }

    public void atualizarEndereco(final Coordenada coordenada, final TipoSeguranca seguranca) {
        // TODO: Buscar o endereco mais próximo com base nas coordenadas
        System.out.println(">> Buscando endereço mais próximo");

        // TODO: Atualizar o status de seguranca do endereco
        System.out.println(">> Atualizando nível de segurança do endereço");

        notificarObservadores();
    }

    public void registrarObservador(final MapaObserver observador) {
        mObservadores.add(observador);
    }

}
