package service;

import model.Usuario;
import enums.Perfil;
import repository.UsuarioRepository;

public class UsuarioService {
    private UsuarioRepository repository = new UsuarioRepository();

    public void cadastrarUsuario(String nomeCompleto, String cpf, String email, String cargo, String login, String senha, Perfil perfil) {
        // Validações simples
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF deve ter 11 dígitos.");
        }
        if (repository.buscarPorLogin(login) != null) {
            throw new IllegalArgumentException("Login já existe.");
        }
        Usuario usuario = new Usuario(nomeCompleto, cpf, email, cargo, login, senha, perfil);
        repository.salvar(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public Usuario buscarPorLogin(String login) {
        return repository.buscarPorLogin(login);
    }

    public Usuario login(String login, String senha) {
        Usuario usuario = repository.buscarPorLogin(login);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        }
        return null;
    }

    public void listarUsuarios() {
        for (Usuario u : repository.listarTodos()) {
            System.out.println(u);
        }
    }
}