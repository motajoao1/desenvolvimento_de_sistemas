import java.util.Scanner;
public class ExerFaixaEtaria {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Você está na faixa etária da criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Você está na faixa etária do adolescente.");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Você está na faixa etária do adulto.");
        } else if (idade >= 60) {
            System.out.println("Você está na faixa etária do idoso.");
        } else {
            System.out.println("Idade inválida.");
        }
        sc.close();
    }
    
}