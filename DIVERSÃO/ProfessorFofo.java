import java.util.Scanner;

public class ProfessorFofo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        do {
            System.out.print("Digite o nome do professor mais fofo do SENAI: ");
            nome = scanner.nextLine();
        } while (!nome.equalsIgnoreCase("Anderson"));

        System.out.println("Resposta correta! Programa encerrado.");

        scanner.close();
    }
}