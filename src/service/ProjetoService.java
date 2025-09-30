package service;

import model.Projeto;
import model.Usuario;
import enums.Perfil;
import enums.Status;
import repository.ProjetoRepository;

import java.time.LocalDate;

public class ProjetoService {
    private ProjetoRepository repository = new ProjetoRepository();
    private UsuarioService usuarioService = new UsuarioService();

    public void cadastrarProjeto(String nome, String descricao, LocalDate dataInicio, LocalDate dataTerminoPrevista, Status status, String loginGerente) {
        if (dataTerminoPrevista.isBefore(dataInicio)) {
            throw new IllegalArgumentException("Data de término deve ser após a de início.");
        }
        Usuario gerente = usuarioService.buscarPorLogin(loginGerente);
        if (gerente == null || gerente.getPerfil() != Perfil.GERENTE) {
            throw new IllegalArgumentException("Gerente inválido ou não é gerente.");
        }
        Projeto projeto = new Projeto(nome, descricao, dataInicio, dataTerminoPrevista, status, gerente);
        repository.salvar(projeto);
        System.out.println("Projeto cadastrado com sucesso!");
    }

    public void listarProjetos() {
        for (Projeto p : repository.listarTodos()) {
            System.out.println(p);
        }
    }
}