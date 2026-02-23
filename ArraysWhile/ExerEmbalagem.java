import java.util.Scanner;

public class ExerEmbalagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1 - Caixa de papelao");
            System.out.println("2 - Sacola plastica");
            System.out.println("3 - Embalagem de vidro");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Ideal para transporte e armazenamento");
                    break;
                case 2:
                    System.out.println("Leve e pratica, mas pouco sustentavel");
                    break;
                case 3:
                    System.out.println("Resistente e reutilizavel");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
        sc.close();
    }
}
