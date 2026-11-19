mport java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        scanner entrada = new Scanner(System.in);

        double nota, frequencia;

        system.out.println("Digite a nota; ");
        nota = entrada.nextDouble();

        system.out.println("Digite o percentual de frequência: ");
        frequencia = entrada.nextDouble();

        if (nota >= 7 && frequencia >= 75) {
            system.out.println("Aluno aprovado!!");
        } else {
            system.out.println("Aluno reprovado!");
        }
    }
}