import java.util.Scanner;

public class entradas {
    public static void main(String[] args) {
        scanner entrada = new Scanner(System.in);

        int idade;

        system.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if (idade <= 12 || idade >= 65) {
            system.out.println("entrada gratuita!!");
        }
    }
}