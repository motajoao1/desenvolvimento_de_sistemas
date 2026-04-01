package ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerCadastroNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int opcao;

        while (true) {
            System.out.println("\n=== CADASTRO PESSOA ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Pesquisar (por nome)");
            System.out.println("4 - Alterar (por nome)");
            System.out.println("5 - Remover (por nome)");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1: 
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    nomes.add(nome);
                    System.out.println("Cadastro realizado!");
                    break;

                case 2: 
                    if (nomes.isEmpty()) {
                        System.out.println("Sem cadastro no sistema.");
                        break;
                    }

                    System.out.println("\nDados cadastrados:");
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println(i + " - " + nomes.get(i));
                    }
                    break;

                case 3: 
                    System.out.print("Digite o nome que deseja pesquisar: ");
                    String nomePesquisa = sc.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < nomes.size(); i++) {
                        if (nomes.get(i).equalsIgnoreCase(nomePesquisa)) {
                            System.out.println("Nome encontrado na posição: " + i);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Nome não encontrado.");
                    }
                    break;

                case 4: 
                    int posAlterar;
                    do {
                        System.out.print("Digite a posição do nome que deseja alterar: ");
                        posAlterar = sc.nextInt();
                        sc.nextLine(); 
                        if (posAlterar < 0 || posAlterar >= nomes.size()) {
                            System.out.println("Posição inválida. Tente novamente.");
                        }
                    } while (posAlterar < 0 || posAlterar >= nomes.size());

                    System.out.print("Digite o novo nome: ");
                    String novoNome = sc.nextLine();
                    nomes.set(posAlterar, novoNome);
                    System.out.println("Nome alterado com sucesso!");
                    break;
                    
                case 5: 
                    int posRemover;
                    do {
                        System.out.print("Digite a posição do nome que deseja remover: ");
                        posRemover = sc.nextInt();
                        sc.nextLine(); 
                        if (posRemover < 0 || posRemover >= nomes.size()) {
                            System.out.println("Posição inválida. Tente novamente.");
                        }
                    } while (posRemover < 0 || posRemover >= nomes.size());
                    
                    nomes.remove(posRemover);
                    System.out.println("Nome removido com sucesso!");
                    break;
            }
        }
        sc.close();
    }
}
