Gerenciador
Sistema em Java para gestão de projetos e equipes, desenvolvido para fins acadêmicos. Utiliza o padrão MVC, interface de console e armazenamento em memória para gerenciar cadastros de usuários, projetos e equipes.

📋 Visão Geral
O Gerenciador é um sistema de informação projetado para facilitar a gestão de projetos e equipes. Desenvolvido individualmente, suporta cadastros e listagens com validações, seguindo boas práticas de programação orientada a objetos (POO). Ideal para uso educacional.
🚀 Funcionalidades

Usuários: Cadastro/listagem (nome, CPF, e-mail, cargo, login, senha, perfil: Administrador, Gerente, Colaborador).
Projetos: Cadastro/listagem (nome, descrição, datas, status: Planejado, Em Andamento, Concluído, Cancelado, gerente).
Equipes: Cadastro/listagem (nome, descrição, membros).
Em Desenvolvimento: Tarefas, alocação de equipes, relatórios.

🏗️ Arquitetura

Padrão: Model-View-Controller (MVC).
Pacotes:
model: Entidades (Usuario, Projeto, Equipe).
service: Lógica (UsuarioService, ProjetoService, EquipeService).
repository: Armazenamento (UsuarioRepository, ProjetoRepository, EquipeRepository).
enums: Perfil, Status.


Armazenamento: Memória (HashMap, ArrayList).

🛠️ Tecnologias

Java JDK 17
Visual Studio Code (Java Extension Pack)
Bibliotecas: java.util, java.time

📦 Pré-requisitos

Java JDK 17
IDE (VS Code, IntelliJ)
Git

⚙️ Instalação

Clone o repositório:git clone https://github.com/SEU_USUARIO/Gerenciador.git


Abra a pasta Gerenciador no VS Code.
Configure o ambiente Java (JAVA_HOME).

▶️ Como Executar

Compile o projeto:javac src/controller/Main.java


Execute:java src.controller.Main


Use o menu (opções 1-7) para interagir.


📖 Uso

Menu: Escolha opções para gerenciar usuários, projetos ou equipes.
Exemplo:
Cadastre um usuário (GERENTE).
Cadastre um projeto com gerente.
Cadastre uma equipe com membros.



👨‍💻 Autor
Gilmar Oliveira

📜 Licença
MIT License – Uso acadêmico.
