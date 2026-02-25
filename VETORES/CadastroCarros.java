import java.util.Scanner;

public class CadastroCarros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carros = new String[10]; 
        int opcao;
        int total = 0; 

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Listar carros");
            System.out.println("3 - Alterar carro");
            System.out.println("4 - Remover carro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {

                case 1:
                    if (total < carros.length) {
                        System.out.print("Digite o nome do carro: ");
                        carros[total] = scanner.nextLine();
                        total++;
                        System.out.println("Carro cadastrado com sucesso!");
                    } else {
                        System.out.println("Array cheio! Não é possível cadastrar mais carros.");
                    }
                    break;

                case 2:
                    if (total == 0) {
                        System.out.println("Nenhum carro cadastrado.");
                    } else {
                        System.out.println("\nLista de carros:");
                        for (int i = 0; i < total; i++) {
                            System.out.println(i + " - " + carros[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o índice do carro a alterar: ");
                    int indiceAlterar = scanner.nextInt();
                    scanner.nextLine();

                    if (indiceAlterar >= 0 && indiceAlterar < total) {
                        System.out.print("Digite o novo nome do carro: ");
                        carros[indiceAlterar] = scanner.nextLine();
                        System.out.println("Carro alterado com sucesso!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o índice do carro a remover: ");
                    int indiceRemover = scanner.nextInt();

                    if (indiceRemover >= 0 && indiceRemover < total) {
                        for (int i = indiceRemover; i < total - 1; i++) {
                            carros[i] = carros[i + 1];
                        }
                        carros[total - 1] = null;
                        total--;
                        System.out.println("Carro removido com sucesso!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}