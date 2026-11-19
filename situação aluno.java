import java.util.Scanner;

public class aluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double nota, frequencia;

        System.out.println("digite a nota:");
        nota = ler.nextDouble();

        System.out.println("digite a frequencia:");
        frequencia = ler.nextDouble();

        if (nota >= 6 && frequencia >= 75) {
            if (nota >= 9 && frequencia >= 90) {
                System.out.println("aluno destacado");
            } else {
                System.out.println("aluno aprovado");
            }
        } else {
            if (frequencia >= 75) {
                System.out.println("aluno em reavaliacao");
            } else {
                System.out.println("aluno reprovado por frequencia");
            }
        }
    }
}