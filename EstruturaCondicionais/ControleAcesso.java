import java.util.Scanner;

public class ControleAcesso {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Bem-vindo, " + nome + "! Você tem acesso ao sistema.");
        } else {
            System.out.println("Desculpe, " + nome + ". Você não tem acesso ao sistema.");
        }
        sc.close();
    }
}