import java.util.Scanner;

public class CadastroProduto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] produtos = new String[5];
        int[] quantidades = new int[5];

        int qtd = 0;
        int opcao;

        while (true) {

            System.out.println("\n=== SISTEMA DE PRODUTOS ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 6) {
                System.out.println("Saindo do sistema...");
                break;
            }

            switch (opcao) {

                case 1: // CADASTRAR
                    if (qtd == produtos.length) {
                        System.out.println("Lista cheia! Não é possível cadastrar.");
                        break;
                    }

                    System.out.print("Nome do produto: ");
                    produtos[qtd] = sc.nextLine();

                    System.out.print("Quantidade em estoque: ");
                    quantidades[qtd] = sc.nextInt();
                    sc.nextLine();

                    qtd++;

                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2: // LISTAR
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }

                    System.out.println("\nProdutos cadastrados:");

                    for (int i = 0; i < qtd; i++) {
                        System.out.println(i + " - " + produtos[i] + " - Estoque: " + quantidades[i]);
                    }

                    break;

                case 3: // PESQUISAR
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }

                    System.out.print("Digite o nome do produto: ");
                    String busca = sc.nextLine();

                    int posBusca = -1;

                    for (int i = 0; i < qtd; i++) {
                        if (produtos[i].equalsIgnoreCase(busca)) {
                            posBusca = i;
                            break;
                        }
                    }

                    if (posBusca == -1) {
                        System.out.println("Produto não encontrado.");
                    } else {
                        System.out.println("Produto: " + produtos[posBusca] +
                                " | Quantidade: " + quantidades[posBusca]);
                    }

                    break;

                case 4: // ALTERAR
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }

                    System.out.print("Digite o produto para alterar: ");
                    String nomeAlterar = sc.nextLine();

                    int posAlt = -1;

                    for (int i = 0; i < qtd; i++) {
                        if (produtos[i].equalsIgnoreCase(nomeAlterar)) {
                            posAlt = i;
                            break;
                        }
                    }

                    if (posAlt == -1) {
                        System.out.println("Produto não encontrado.");
                    } else {

                        System.out.print("Novo nome: ");
                        String novoNome = sc.nextLine();

                        System.out.print("Nova quantidade: ");
                        int novaQuantidade = sc.nextInt();
                        sc.nextLine();

                        produtos[posAlt] = novoNome;
                        quantidades[posAlt] = novaQuantidade;

                        System.out.println("Produto alterado com sucesso!");
                    }

                    break;

                case 5: // REMOVER
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }

                    System.out.print("Digite o produto para remover: ");
                    String nomeRemover = sc.nextLine();

                    int posRem = -1;

                    for (int i = 0; i < qtd; i++) {
                        if (produtos[i].equalsIgnoreCase(nomeRemover)) {
                            posRem = i;
                            break;
                        }
                    }

                    if (posRem == -1) {
                        System.out.println("Produto não encontrado.");
                    } else {

                        for (int i = posRem; i < qtd - 1; i++) {
                            produtos[i] = produtos[i + 1];
                            quantidades[i] = quantidades[i + 1];
                        }

                        produtos[qtd - 1] = null;
                        quantidades[qtd - 1] = 0;

                        qtd--;

                        System.out.println("Produto removido com sucesso!");
                    }

                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}