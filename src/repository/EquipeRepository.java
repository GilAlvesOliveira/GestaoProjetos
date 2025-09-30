package repository;

import model.Equipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquipeRepository {
    private static Map<String, Equipe> equipes = new HashMap<>(); // Chave: nome da equipe

    public void salvar(Equipe equipe) {
        equipes.put(equipe.getNome(), equipe);
    }

    public Equipe buscarPorNome(String nome) {
        return equipes.get(nome);
    }

    public List<Equipe> listarTodos() {
        return new ArrayList<>(equipes.values());
    }

    public void deletar(String nome) {
        equipes.remove(nome);
    }
}