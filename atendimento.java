import java.util.Scanner;

public class atendimento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.println("digite a idade:");
        idade = ler.nextInt();

        if (idade <= 12) {
            System.out.println("atendimento infantil");
        } else if (idade <= 59) {
            System.out.println("atendimento adulto");
        } else {
            System.out.println("atendimento preferencial");
        }
    }
}