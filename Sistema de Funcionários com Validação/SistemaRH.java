import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class SistemaRH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Funcionario> equipe = new ArrayList<>();

        System.out.println("--- Sistema de Cadastro de Funcionários ---");

        while (true) {
            try {
                System.out.print("\nDigite o nome do funcionário (ou 'sair' para finalizar): ");
                String nome = scanner.nextLine();

                if (nome.equalsIgnoreCase("sair")) {
                    break;
                }

                System.out.print("Digite o salário base: R$ ");
                double salarioBase = scanner.nextDouble();
                scanner.nextLine(); 

                System.out.print("O funcionário é Gerente ou Vendedor? (G/V): ");
                String tipo = scanner.nextLine().toUpperCase();

                if (tipo.equals("G")) {
                    equipe.add(new Gerente(nome, salarioBase));
                    System.out.println("Gerente cadastrado com sucesso!");
                } else if (tipo.equals("V")) {
                    System.out.print("Digite o valor da comissão: R$ ");
                    double comissao = scanner.nextDouble();
                    scanner.nextLine(); 
                    
                    equipe.add(new Vendedor(nome, salarioBase, comissao));
                    System.out.println("Vendedor cadastrado com sucesso!");
                } else {
                    System.out.println("Erro: Tipo de cargo inválido.");
                }

            
            } catch (InputMismatchException e) {
                System.out.println("Erro de entrada: Digite um número válido para o salário/comissão.");
                scanner.nextLine(); 
            } catch (IllegalArgumentException e) {
                System.out.println("Erro de validação: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        System.out.println("\n--- Folha de Pagamento ---");
        for (Funcionario f : equipe) {
            f.exibir(); 
            System.out.println("--------------------------");
        }

        scanner.close();
    }
}