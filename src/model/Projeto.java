package model;

import enums.Status;

import java.time.LocalDate;
import java.util.Objects;

public class Projeto {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataTerminoPrevista;
    private Status status;
    private Usuario gerente;

    public Projeto(String nome, String descricao, LocalDate dataInicio, LocalDate dataTerminoPrevista, Status status, Usuario gerente) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTerminoPrevista = dataTerminoPrevista;
        this.status = status;
        this.gerente = gerente;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }
    public LocalDate getDataTerminoPrevista() { return dataTerminoPrevista; }
    public void setDataTerminoPrevista(LocalDate dataTerminoPrevista) { this.dataTerminoPrevista = dataTerminoPrevista; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
    public Usuario getGerente() { return gerente; }
    public void setGerente(Usuario gerente) { this.gerente = gerente; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projeto projeto = (Projeto) o;
        return Objects.equals(nome, projeto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataTerminoPrevista=" + dataTerminoPrevista +
                ", status=" + status +
                ", gerente=" + gerente.getNomeCompleto() +
                '}';
    }
}