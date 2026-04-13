import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op = -1;
        while (op != 0) {
            try {
                System.out.println("\n Menu ");
                System.out.println("1 - Adicionar");
                System.out.println("2- Listar");
                System.out.println("3- Remover item");
                System.out.println("0- Sair");
                System.out.print("Digite a opção desejada: ");
                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        System.out.print("Digite um nome: ");
                        String nome = sc.nextLine();
                        lista.add(nome);
                        System.out.println("Nome adicionado com sucesso!");
                        break;
                    case 2:
                        if (lista.isEmpty()) {
                            System.out.println("A lista está vazia.");
                        } else {
                            System.out.println("lista: " + lista);
                        }
                        break;
                    case 3:
                        System.out.print("Digite o número do item a ser removido: ");
                        int indice = sc.nextInt();
                        sc.nextLine();
                        lista.remove(indice - 1);
                        System.out.println("Item removido com sucesso!");
                        break;
                    case 0:
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) { // Captura a exceção de entrada inválida para a opção do menu
                System.out.println("Erro: Você deve digitar um número inteiro para a opção.");
                sc.nextLine();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro: Índice fora do limite da lista.");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        sc.close();
    }
}