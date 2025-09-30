package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipe {
    private String nome;
    private String descricao;
    private List<Usuario> membros = new ArrayList<>();

    public Equipe(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void adicionarMembro(Usuario usuario) {
        if (!membros.contains(usuario)) {
            membros.add(usuario);
        }
    }

    public void removerMembro(Usuario usuario) {
        membros.remove(usuario);
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public List<Usuario> getMembros() { return new ArrayList<>(membros); } // Cópia para imutabilidade

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipe equipe = (Equipe) o;
        return Objects.equals(nome, equipe.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", membros=" + membros.size() +
                '}';
    }
}