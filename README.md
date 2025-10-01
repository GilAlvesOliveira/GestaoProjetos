# 📌 Gerenciador

Sistema em Java para gestão de projetos e equipes, desenvolvido com fins acadêmicos.  
Segue o padrão MVC, possui interface em console e utiliza armazenamento em memória para gerenciar cadastros de usuários, projetos e equipes.

---

## 📋 Visão Geral

O **Gerenciador** é um sistema de informação projetado para facilitar a administração de projetos e equipes.

- Desenvolvido individualmente  
- Suporte a cadastros e listagens com validações  
- Baseado em boas práticas de Programação Orientada a Objetos (POO)  
- Ideal para uso educacional

---

## 🚀 Funcionalidades

### ✅ Usuários

- Cadastro e listagem  
- **Atributos:** nome, CPF, e-mail, cargo, login, senha, perfil (Administrador, Gerente, Colaborador)

### ✅ Projetos

- Cadastro e listagem  
- **Atributos:** nome, descrição, datas, status (Planejado, Em Andamento, Concluído, Cancelado), gerente

### ✅ Equipes

- Cadastro e listagem  
- **Atributos:** nome, descrição, membros

### 🔄 Em Desenvolvimento

- Gerenciamento de tarefas  
- Alocação de equipes  
- Relatórios

---

## 🏗️ Arquitetura

- **Padrão:** Model-View-Controller (MVC)
- **Pacotes:**
  - `model`: Entidades (`Usuario`, `Projeto`, `Equipe`)
  - `service`: Lógica (`UsuarioService`, `ProjetoService`, `EquipeService`)
  - `repository`: Armazenamento (`UsuarioRepository`, `ProjetoRepository`, `EquipeRepository`)
  - `enums`: Perfil, Status
- **Armazenamento:** Memória (`HashMap`, `ArrayList`)

---

## 🛠️ Tecnologias Utilizadas

- ☕ **Java JDK 17**
- 🖥️ **Visual Studio Code** (Java Extension Pack)
- 📚 **Bibliotecas:** `java.util`, `java.time`

---

## 📦 Pré-requisitos

- Java JDK 17  
- IDE (VS Code ou IntelliJ)  
- Git instalado

---

## ⚙️ Instalação

```sh
# Clone o repositório
git clone https://github.com/SEU_USUARIO/Gerenciador.git

# Acesse a pasta do projeto
cd Gerenciador
```

---

## ▶️ Como Executar

1. Configure o ambiente Java (`JAVA_HOME`).
2. Compile o projeto:
    ```sh
    javac src/controller/Main.java
    ```
3. Execute:
    ```sh
    java src.controller.Main
    ```
4. Use o menu (opções 1-7) para interagir.

---

## 📖 Uso

- Menu: Escolha opções para gerenciar usuários, projetos ou equipes.

**Exemplo:**
1. Cadastre um usuário (GERENTE).
2. Cadastre um projeto com gerente.
3. Cadastre uma equipe com membros.

---

## 👨‍💻 Autor

Gilmar Oliveira

---

## 📜 Licença

MIT License – Uso acadêmico.