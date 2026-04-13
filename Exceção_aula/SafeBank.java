import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeBank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAtual = 1500.00; 

        try {
            System.out.println("=== Bem-vindo ao SafeBank ===");
            System.out.println("Seu saldo atual é: R$ " + saldoAtual);
            System.out.print("Digite o valor que deseja sacar: ");
            
            double valorSaque = sc.nextDouble();

            if (valorSaque <= 0) {
                throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
            }

            if (valorSaque > saldoAtual) {
                throw new IllegalArgumentException("Saldo insuficiente para realizar este saque.");
            }

            saldoAtual -= valorSaque;
            System.out.println("Saque de R$ " + valorSaque + " aprovado!");
            System.out.println("Novo saldo: R$ " + saldoAtual);

        } 
        catch (InputMismatchException e) {
            System.out.println("Erro: Valor inválido. Por favor, digite apenas números.");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Erro na operação: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } 
        finally {
            System.out.println("Operação encerrada");
            sc.close();
        }
    }
}