import java.util.Scanner;

public class SistemaCadastroDeAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número de alunos a serem cadastrados
        System.out.println("Quantos alunos deseja cadastrar? ");
        int numeroDeAlunos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Validação do número de alunos
        if (numeroDeAlunos <= 0) {
            System.out.println("Número de alunos inválido. O programa será encerrado.");
            return;
        }

        // Criação do array de alunos
        Aluno[] alunos = new Aluno[numeroDeAlunos];

        // Loop para cadastrar os alunos
        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.println("\nCadastro do aluno " + (i + 1) + ":");

            System.out.println("Nome: ");
            String nome = scanner.nextLine(); // Usar nextLine() para capturar nomes completos

            System.out.println("Matrícula: ");
            String matricula = scanner.nextLine();

            System.out.println("Quantidade de notas: ");
            int numeroDeNotas = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            // Validação do número de notas
            if (numeroDeNotas <= 0) {
                System.out.println("Numero de notas invalido. Cadastro cancelado para este aluno.");
                continue;
            }

            // Criar o objeto Aluno
            Aluno aluno = new Aluno(nome, matricula, numeroDeNotas);

            // Adicionar as notas do aluno
            aluno.adicionarNotas(scanner);

            // Armazenar o aluno no array
            alunos[i] = aluno;
        }

        // Exibir os resultados de todos os alunos
        System.out.println("\n--- Resultados dos Alunos ---");
        for (Aluno aluno : alunos) {
            aluno.exibirResultado();
            System.out.println(); // Espaço entre os resultados
        }

        scanner.close(); // Fechar o Scanner
    }
}