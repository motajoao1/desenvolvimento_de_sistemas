import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaLoja {
    private static ArrayList<Produto> estoque = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            try {
                System.out.println("\n--- SISTEMA DE ESTOQUE ---");
                System.out.println("1. Cadastrar Produto");
                System.out.println("2. Listar Produtos");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcao) {
                    case 1 -> cadastrarProduto();
                    case 2 -> listarProdutos();
                    case 0 -> System.out.println("Encerrando sistema...");
                    default -> System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.err.println("Erro: Você deve digitar um valor numérico válido.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.err.println("Erro de Negócio: " + e.getMessage());
            }
        }
    }

    private static void cadastrarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        Produto novoProduto = new Produto(nome, preco, quantidade);
        estoque.add(novoProduto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void listarProdutos() {
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("\n--- PRODUTOS EM ESTOQUE ---");
            for (Produto p : estoque) {
                p.exibirDados();
            }
        }
    }
}