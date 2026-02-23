import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {

        System.out.println("\033[H\033[2J");
        System.out.flush();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Olá " + nome + ", você é maior de idade.");
        } else {
            System.out.println("Olá " + nome + ", você é menor de idade.");
        }
        sc.close();
    }
}