import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaBancario {
    private static ArrayList<ContaBancaria> contas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            try {
                exibirMenu();
                opcao = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcao) {
                    case 1 -> cadastrarConta();
                    case 2 -> realizarDeposito();
                    case 3 -> realizarSaque();
                    case 4 -> listarContas();
                    case 0 -> System.out.println("Saindo do sistema...");
                    default -> System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.err.println("Erro: Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); 
            } catch (IllegalArgumentException e) {
                System.err.println("Erro de Validação: " + e.getMessage());
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n--- MENU BANCO JAVA ---");
        System.out.println("1. Cadastrar Conta");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Listar Contas");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarConta() {
        System.out.print("Nome do titular: ");
        String nome = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        
        contas.add(new ContaBancaria(nome, saldo));
        System.out.println("Conta cadastrada com sucesso!");
    }

    private static void realizarDeposito() {
        ContaBancaria conta = buscarConta();
        if (conta != null) {
            System.out.print("Valor do depósito: ");
            double valor = scanner.nextDouble();
            conta.depositar(valor);
        }
    }

    private static void realizarSaque() {
        ContaBancaria conta = buscarConta();
        if (conta != null) {
            System.out.print("Valor do saque: ");
            double valor = scanner.nextDouble();
            conta.sacar(valor);
        }
    }

    private static void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            System.out.println("\n--- LISTA DE CONTAS ---");
            for (ContaBancaria c : contas) {
                c.exibirDados();
            }
        }
    }

    private static ContaBancaria buscarConta() {
        System.out.print("Digite o nome exato do titular: ");
        String nome = scanner.nextLine();
        for (ContaBancaria c : contas) {
            if (c.getTitular().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        System.out.println("Conta não encontrada.");
        return null;
    }
}