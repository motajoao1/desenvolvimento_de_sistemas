import java.util.Scanner;

public class ExerMochila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1 - Escolar");
            System.out.println("2 - Viagem");
            System.out.println("3 - Esportiva");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Compacta e ideal para estudantes");
                    break;
                case 2:
                    System.out.println("Espacosa, ideal para longas jornadas");
                    break;
                case 3:
                    System.out.println("Leve, resistente e ergonomica");
                    break;
                case 4:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
        sc.close();
    }
}