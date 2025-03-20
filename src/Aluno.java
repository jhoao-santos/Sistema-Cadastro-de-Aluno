import java.util.Scanner;

public class Aluno {

    // Propriedades da classe
    private String nome;
    private String matricula;
    private double[] notas;

    // Construtor
    public Aluno(String nome, String matricula, int numeroDeNotas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[numeroDeNotas];
    }

    // Método para obter o nome do aluno
    public String getNome() {
        return nome;
    }

    // Método para adicionar notas
    public void adicionarNotas(Scanner scanner) {
        System.out.println("Digite as notas para o aluno " + nome + ":");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            double nota = scanner.nextDouble();
            
            // Validação da nota
            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida! A nota deve estar entre 0 e 10.");
                i--; // Repetir a entrada para a mesma nota
            } else {
                notas[i] = nota;
            }
        }
    }

    // Método para calcular a média
    public double calcularMedia() {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    // Método para exibir o resultado
    public void exibirResultado() {
        double media = calcularMedia();

        System.out.println("O nome do aluno e: " + nome + ", a matrícula e: " + matricula +
                ", e a media final e de: " + media);

        if (media >= 6.0) {
            System.out.println("Parabens, voca foi aprovado!");
        } else {
            System.out.println("Nota insuficiente, voce foi reprovado!");
        }
    }
}