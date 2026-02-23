import java.util.Scanner;

public class Exdo3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int op=0;

        do { 
            System.out.println("Menu:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Remover");
            System.out.print( "4. Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Opção Cadastrar selecionada.");
                    break;
                case 2:
                    System.out.println("Opção Listar selecionada.");
                    break;
                case 3:
                    System.out.println("Opção Remover selecionada.");
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (op != 4);
        
    }  
}
