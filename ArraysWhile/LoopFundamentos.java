import java.util.Scanner;

public class LoopFundamentos {
    public static void main(String[] args) {
        
        System.out.println("\033[H\033[2J");
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        int numero = 0;

        while (numero!=10) {

            System.out.println("INFORME 10 PARA CANCELAR");
            numero = sc.nextInt();
        }
        System.out.println("programa encerrado");

        sc.close();
    }
}

