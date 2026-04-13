import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Informe um numero inteiro: ");
            int numero = sc.nextInt();
            System.out.println("Voce digitou: " + numero);
        } 
        catch (InputMismatchException e) {
            System.out.println("Erro: Voce deve digitar um numero inteiro!");
        } 
        finally {
            System.out.println("Programa finalizado");
            sc.close();
        }
    }
}