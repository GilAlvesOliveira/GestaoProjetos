Gerenciador
Descrição
Sistema desenvolvido em Java para gerenciar projetos e equipes, criado para fins acadêmicos. Permite cadastro de usuários, projetos e equipes, com interface via console. Usa o padrão MVC e armazenamento em memória.
Funcionalidades

Cadastro de Usuários: Nome, CPF, e-mail, cargo, login, senha, perfil (ADMINISTRADOR, GERENTE, COLABORADOR).
Cadastro de Projetos: Nome, descrição, datas, status (PLANEJADO, EM_ANDAMENTO, CONCLUIDO, CANCELADO), gerente.
Cadastro de Equipes: Nome, descrição, membros.
Listagem: Usuários, projetos e equipes.
Pendentes: Cadastro de tarefas, alocação de equipes, relatórios.

Estrutura

Pacotes:
model: Entidades (Usuario, Projeto, Equipe).
service: Lógica de negócios (UsuarioService, ProjetoService, EquipeService).
repository: Armazenamento (UsuarioRepository, ProjetoRepository, EquipeRepository).
controller: Interação (Main.java).
enums: Perfis e status (Perfil, Status).


Arquitetura: MVC.
Armazenamento: Memória (HashMap, ArrayList).

Pré-requisitos

Java JDK 17 ou superior.
IDE (ex: VS Code com Java Extension Pack).
Git e GitHub Desktop (opcional).

Como Executar

Clone o repositório:git clone https://github.com/SEU_USUARIO/Gerenciador.git


Navegue até a pasta:cd Gerenciador


Compile:javac src/controller/Main.java


Execute:java src.controller.Main


Use o menu no console para cadastrar/listar.

Instalação

Baixe o JDK 17 em oracle.com.
Configure JAVA_HOME e PATH.
Abra a pasta src em uma IDE.

Uso

Menu: Escolha opções (1-7) para gerenciar usuários, projetos, equipes.
Exemplo: Cadastre um usuário (GERENTE), um projeto e uma equipe.

Autor

Desenvolvido por [SEU_NOME].

Licença

MIT License (uso acadêmico).
