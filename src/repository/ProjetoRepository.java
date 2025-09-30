package repository;

import model.Projeto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjetoRepository {
    private static Map<String, Projeto> projetos = new HashMap<>(); // Chave: nome do projeto

    public void salvar(Projeto projeto) {
        projetos.put(projeto.getNome(), projeto);
    }

    public Projeto buscarPorNome(String nome) {
        return projetos.get(nome);
    }

    public List<Projeto> listarTodos() {
        return new ArrayList<>(projetos.values());
    }

    public void deletar(String nome) {
        projetos.remove(nome);
    }
}