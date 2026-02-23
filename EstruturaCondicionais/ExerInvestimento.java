import java.util.Scanner;

public class ExerInvestimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do investimento: ");
        double valor = sc.nextDouble();

        if (valor > 50000) {
            System.out.println("Taxa Isenta (0%)");
        } else if (valor > 20000) {
            System.out.println("Taxa Silver (0.5%)");
        } else if (valor > 5000) {
            System.out.println("Taxa Bronze (1.0%)");
        } else {
            System.out.println("Taxa Padrao (2.0%)");
        }

        sc.close();
    }
}
