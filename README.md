# 🎓📘 Sistema de Cadastro de Alunos em Java  

Este projeto é um **sistema de cadastro de alunos** desenvolvido em Java. Ele permite que o usuário registre alunos, insira notas e visualize a média e o status de aprovação de cada um.  

---

## 📌 Funcionalidades  

✅ **Cadastro de alunos**: O usuário pode inserir o **nome** e a **matrícula** de cada aluno.  

✅ **Registro de notas**: O sistema permite a inserção de **notas entre 0 e 10** para cada aluno.  

✅ **Cálculo da média**: O programa calcula automaticamente a média das notas registradas.  

✅ **Verificação do status**: O aluno é considerado **aprovado** se a média for **maior ou igual a 6.0**, caso contrário, está **reprovado**.  

✅ **Interface interativa via console**: Todo o processo é realizado diretamente no terminal.  

✅ **Cadastro de múltiplos alunos**: O usuário pode registrar diversos alunos e visualizar seus respectivos resultados.  

---

## ⚙️ Tecnologias Utilizadas  

🔹 **Java (JDK X.X)** – Linguagem principal do projeto.  

🔹 **Scanner (java.util.Scanner)** – Para entrada de dados do usuário.  

🔹 **ArrayList (java.util.ArrayList)** – Para armazenar os dados dos alunos.  

🔹 **Arrays (java.util.Arrays)** – Para manipulação e cálculo das médias.  

🔹 **Estruturas de controle** – Para validação e exibição dos resultados.  

---

## 🚀 Como Executar o Projeto  

1. **Clone o repositório:**  

   ```bash
   git clone https://github.com/seu-usuario/sistema-cadastro-alunos.git
   cd sistema-cadastro-alunos
Abra o projeto em uma IDE (IntelliJ, Eclipse, VS Code).

Compile e execute o código:

javac SistemaCadastroDeAluno.java
java SistemaCadastroDeAluno
Siga as instruções no terminal para cadastrar alunos e visualizar os resultados.

📷 Exemplo de Execução

Quantos alunos deseja cadastrar?  
2  

Cadastro do aluno 1:  
Nome: João  
Matrícula: 12345  
Quantidade de notas: 3  

Digite a nota 1: 8.5  
Digite a nota 2: 7.0  
Digite a nota 3: 6.5  

Cadastro do aluno 2:  
Nome: Maria  
Matrícula: 67890  
Quantidade de notas: 3  

Digite a nota 1: 5.0  
Digite a nota 2: 4.5  
Digite a nota 3: 6.0  

--- Resultados dos Alunos ---  

📜 Nome: **João** | Matrícula: **12345** | Média: **7.33** ✅ **Aprovado**  


📜 Nome: **Maria** | Matrícula: **67890** | Média: **5.16** ❌ **Reprovado**  

📌 Melhorias Futuras

🔹 Permitir a edição de alunos e notas.


🔹 Implementar um banco de dados para armazenar os registros.


🔹 Criar uma interface gráfica com JavaFX ou Swing.


🔹 Implementar um sistema de login para acesso aos registros.


🔗 Autor: 📌 João Santos
