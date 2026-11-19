import java.util.Scanner;

public class produtos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int codigo, quantidade;
        double total;

        System.out.println("digite o codigo do produto:");
        codigo = ler.nextInt();

        System.out.println("digite a quantidade:");
        quantidade = ler.nextInt();

        switch (codigo) {
            case 1:
                total = 50 * quantidade;
                System.out.println("bone");
                System.out.println("total: R$ " + total);
                break;

            case 2:
                total = 80 * quantidade;
                System.out.println("calca");
                System.out.println("total: R$ " + total);
                break;

            case 3:
                total = 150 * quantidade;
                System.out.println("tenis");
                System.out.println("total: R$ " + total);
                break;

            default:
                System.out.println("produto nao encontrado");
        }
    }
}