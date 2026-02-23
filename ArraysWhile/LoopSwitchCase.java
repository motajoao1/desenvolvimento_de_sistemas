import java.util.Scanner;

public class LoopSwitchCase {
    public static void main(String[] args) {
        
        System.out.println("\033[H\033[2J");
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        int op=0;
        
        while (op!=4) {
            System.out.println("============= Menu de Cadastro =============");
            System.out.println("(1) Cadastrar");
            System.out.println("(2) Listar");
            System.out.println("(3) Remover");
            System.out.println("(4) Sair");
            System.out.println("Informe a opção desejada: ");

            op=sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Cadastrar");
                    break;
                case 2:
                    System.out.println("Listar");
                    break;
                case 3:
                    System.out.println("Remover");
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
            
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
            sc.close();
    }
}
