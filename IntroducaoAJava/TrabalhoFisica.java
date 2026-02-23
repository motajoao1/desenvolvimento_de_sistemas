import java.util.Scanner;

public class TrabalhoFisica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a Força aplicada (F): ");
        double forca = sc.nextDouble();
        System.out.print("Digite a Distância percorrida (d): ");
        double distancia = sc.nextDouble();
        sc.close();

        double trabalho = forca * distancia;
        System.out.printf("O trabalho realizado é: %.1f %n", trabalho);

    }
}