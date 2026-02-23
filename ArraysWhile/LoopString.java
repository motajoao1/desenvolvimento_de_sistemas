import java.util.Scanner;

public class LoopString {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        String resp="sim";

        while (resp.equalsIgnoreCase("sim")) { // enquanto resposta for igual a sim.
            System.out.println("deseja continuar? Sim ou não");
            resp=sc.nextLine();
        }
        System.out.println("programa encerrado");

        sc.close();
    }
    
}
