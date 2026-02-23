import java.util.Scanner;

public class ExerCds {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço do CD: ");
        double preco = sc.nextDouble();

        if (preco < 10) {
            System.out.println("O CD é barato.");
        } else if (preco >= 10 && preco <= 20) {
            System.out.println("O CD tem um preço razoável.");
        } else {
            System.out.println("O CD é caro.");
        }
        sc.close();
    }
}
