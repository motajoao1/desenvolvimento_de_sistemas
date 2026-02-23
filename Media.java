import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double primeiraNota = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double segundaNota = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double terceiraNota = sc.nextDouble();
        
        sc.close();
        
        // CÁLCULO DA MÉDIA
        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        // IMPRESSÃO DO RESULTADO
        System.out.printf("A média das notas é: %.2f%n", media);
    }
}