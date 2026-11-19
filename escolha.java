import java.util.Scanner;

public class escolha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int turno, disciplina;

        System.out.println("digite o turno:");
        turno = ler.nextInt();

        System.out.println("digite a disciplina:");
        disciplina = ler.nextInt();

        switch (turno) {
            case 1:
                switch (disciplina) {
                    case 1:
                        System.out.println("matematica");
                        break;

                    case 2:
                        System.out.println("portugues");
                        break;

                    default:
                        System.out.println("disciplina nao disponivel no periodo da manha");
                }
                break;

            case 2:
                switch (disciplina) {
                    case 1:
                        System.out.println("historia");
                        break;

                    default:
                        System.out.println("disciplina nao disponivel no periodo da tarde");
                }
                break;

            default:
                System.out.println("turno invalido");
        }
    }
}