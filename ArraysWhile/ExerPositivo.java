import java.util.Scanner;

public class ExerPositivo {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        while (numero >= 0) {
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();

            if (numero >= 0) {
                System.out.println("Voce digitou: " + numero);
            }
        }

        sc.close();
    }
}
