import java.util.Scanner;

public class ExerProfessor {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        String nome = "";

        while (!nome.equalsIgnoreCase("Anderson")) {
            System.out.print("Digite o nome do professor mais fofo do SENAI: ");
            nome = sc.next();

            if (!nome.equalsIgnoreCase("Anderson")) {
                System.out.println("Resposta errada! Tente novamente.");
            }
        }
        System.out.println("Parabens! Voce acertou.");
        sc.close();
    }
}
