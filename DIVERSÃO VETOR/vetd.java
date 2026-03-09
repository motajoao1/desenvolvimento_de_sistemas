import java.util.Scanner;

public class vetd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];
        int[] idade = new int[3];

        for (int i=0; i<3; i++){
            System.out.println("Informe o nome:");
            nomes[i] = sc.nextLine();

            System.out.println("Informe a idade:");
            idade[i] = sc.nextInt();

            sc.nextLine();
        }

        sc.close();
    }
    
}
