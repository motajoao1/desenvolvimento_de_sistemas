import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // ENTRADA DE DADOS
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt(); 

        sc.close();

        // OPERAÇÕES BÁSICAS
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;

        // IMPRESSÃO DOS RESULTADOS
        System.out.println("Números: " + numero1 + " e " + numero2);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}