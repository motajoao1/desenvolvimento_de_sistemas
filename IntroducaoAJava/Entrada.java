import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // CRIAÇÃO DO OBJETO SCANNER PARA ENTRADA DE DADOS
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine(); // LEITURA DE UMA LINHA DE TEXTO

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
        sc.close(); // FECHAMENTO DO SCANNER
    }
}