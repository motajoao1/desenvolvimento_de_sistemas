import java.util.Scanner;

public class ExerCanetas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1 - Esferografica");
            System.out.println("2 - Gel");
            System.out.println("3 - Tinteiro");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Economica e de longa duracao");
                    break;
                case 2:
                    System.out.println("Tinta mais pigmentada e escrita suave");
                    break;
                case 3:
                    System.out.println("Classica e elegante, usada para caligrafia");
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
        sc.close();
    }
}
