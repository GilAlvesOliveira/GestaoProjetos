package repository;

import model.Usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsuarioRepository {
    private static Map<String, Usuario> usuarios = new HashMap<>(); // Chave: login

    public void salvar(Usuario usuario) {
        usuarios.put(usuario.getLogin(), usuario);
    }

    public Usuario buscarPorLogin(String login) {
        return usuarios.get(login);
    }

    public List<Usuario> listarTodos() {
        return new ArrayList<>(usuarios.values());
    }

    public void deletar(String login) {
        usuarios.remove(login);
    }
}