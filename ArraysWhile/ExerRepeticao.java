import java.util.Scanner;

public class ExerRepeticao {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        int contador = 1;

        while (contador <= 100) {
            System.out.println(contador + " - Nunca mais vou fazer bagunça");
            contador++; 
        }

        System.out.println("\nTarefa concluída!");
        sc.close();
    }
}