import java.util.Scanner;

public class TaxaInvestimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do investimento: ");
        double valor = scanner.nextDouble();

        if (valor > 50000) {
            System.out.println("Taxa Isenta (0%)");
        } else if (valor > 20000) {
            System.out.println("Taxa Silver (0.5%)");
        } else if (valor > 5000) {
            System.out.println("Taxa Bronze (1.0%)");
        } else {
            System.out.println("Taxa Padrão (2.0%)");
        }

        scanner.close();
    }
}