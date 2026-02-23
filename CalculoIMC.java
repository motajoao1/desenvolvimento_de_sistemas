import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu peso em kg: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura em metros: ");
        double altura = sc.nextDouble();
        sc.close();
        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Impressão do resultado formatado com duas casas decimais
        System.out.printf("O IMC calculado é: %.2f%n", imc);
    }
}