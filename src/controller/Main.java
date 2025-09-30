package controller;

import service.UsuarioService;
import service.ProjetoService;
import enums.Perfil;
import enums.Status;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            UsuarioService usuarioService = new UsuarioService();
            ProjetoService projetoService = new ProjetoService();

            // Exemplo: Cadastro inicial de admin
            usuarioService.cadastrarUsuario("Admin", "12345678901", "admin@email.com", "Admin", "admin", "123", Perfil.ADMINISTRADOR);

            // Menu principal
            while (true) {
                System.out.println("\n=== Sistema de Gestão de Projetos ===");
                System.out.println("1. Cadastrar Usuário");
                System.out.println("2. Cadastrar Projeto");
                System.out.println("3. Listar Usuários");
                System.out.println("4. Listar Projetos");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer

                if (opcao == 1) {
                    // Cadastro de usuário
                    System.out.print("Nome completo: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF (11 dígitos): ");
                    String cpf = scanner.nextLine();
                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Login: ");
                    String login = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();
                    System.out.print("Perfil (ADMINISTRADOR, GERENTE, COLABORADOR): ");
                    String perfilStr = scanner.nextLine().toUpperCase();
                    Perfil perfil;
                    try {
                        perfil = Perfil.valueOf(perfilStr);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Perfil inválido! Use ADMINISTRADOR, GERENTE ou COLABORADOR.");
                        continue;
                    }
                    try {
                        usuarioService.cadastrarUsuario(nome, cpf, email, cargo, login, senha, perfil);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                } else if (opcao == 2) {
                    // Cadastro de projeto
                    System.out.print("Nome do projeto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Data de início (AAAA-MM-DD): ");
                    String dataInicioStr = scanner.nextLine();
                    System.out.print("Data de término prevista (AAAA-MM-DD): ");
                    String dataTerminoStr = scanner.nextLine();
                    System.out.print("Status (PLANEJADO, EM_ANDAMENTO, CONCLUIDO, CANCELADO): ");
                    String statusStr = scanner.nextLine().toUpperCase();
                    System.out.print("Login do gerente: ");
                    String loginGerente = scanner.nextLine();
                    try {
                        LocalDate dataInicio = LocalDate.parse(dataInicioStr);
                        LocalDate dataTermino = LocalDate.parse(dataTerminoStr);
                        Status status = Status.valueOf(statusStr);
                        projetoService.cadastrarProjeto(nome, descricao, dataInicio, dataTermino, status, loginGerente);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                } else if (opcao == 3) {
                    System.out.println("\nLista de Usuários:");
                    usuarioService.listarUsuarios();
                } else if (opcao == 4) {
                    System.out.println("\nLista de Projetos:");
                    projetoService.listarProjetos();
                } else if (opcao == 5) {
                    System.out.println("Saindo...");
                    break;
                } else {
                    System.out.println("Opção inválida!");
                }
            }
        }
    }
}