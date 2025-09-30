Sistema de Gestão de Projetos e Equipes
Descrição
Sistema desenvolvido em Java para gerenciar projetos e equipes, criado como projeto acadêmico. Permite cadastro de usuários (administradores, gerentes, colaboradores), projetos e equipes, com interface via console. Usa o padrão MVC e armazenamento em memória.
Funcionalidades

Cadastro de Usuários: Nome, CPF, e-mail, cargo, login, senha, perfil (ADMINISTRADOR, GERENTE, COLABORADOR).
Cadastro de Projetos: Nome, descrição, datas, status (PLANEJADO, EM_ANDAMENTO, CONCLUIDO, CANCELADO), gerente.
Cadastro de Equipes: Nome, descrição, membros.
Listagem: Usuários, projetos e equipes.
Pendentes: Cadastro de tarefas, alocação de equipes em projetos, relatórios.

Estrutura

Pacotes:
model: Entidades (Usuario, Projeto, Equipe).
service: Lógica de negócios (UsuarioService, ProjetoService, EquipeService).
repository: Armazenamento em memória (UsuarioRepository, ProjetoRepository, EquipeRepository).
controller: Interação com usuário (Main.java).
enums: Perfis e status (Perfil, Status).


Arquitetura: MVC (Model-View-Controller).
Armazenamento: Memória (HashMap, ArrayList).

Pré-requisitos

Java JDK 17 ou superior.
IDE (ex: VS Code com Java Extension Pack).
Git e GitHub Desktop (opcional).

Como Executar

Clone o repositório:git clone https://github.com/SEU_USUARIO/gestao-projetos-java.git


Navegue até a pasta do projeto:cd gestao-projetos-java


Compile:javac src/controller/Main.java


Execute:java src.controller.Main


Siga o menu no console para cadastrar/listar usuários, projetos e equipes.

Instalação

Baixe o JDK 17 em oracle.com.
Configure o ambiente Java (JAVA_HOME e PATH).
Use VS Code ou outra IDE para abrir a pasta src.

Uso

Menu: Escolha opções (1-7) para cadastrar usuários, projetos, equipes, ou listar dados.
Exemplo:
Cadastre um usuário (perfil GERENTE).
Cadastre um projeto com o gerente.
Cadastre uma equipe e adicione membros.



Autor

Desenvolvido individualmente por [SEU_NOME].

Licença

MIT License (livre para uso acadêmico).