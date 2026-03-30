package ArraysList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArListScannerNomes {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<String>();
        // Adicionando
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes.add(sc.nextLine());
        }
        // Listando
        for(int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        // Alterando
        int indiceAlterar;
        do {
            System.out.print("\nDigite o índice do nome que deseja alterar (0 a " + (nomes.size() - 1) + "):");
            indiceAlterar = sc.nextInt();
            sc.nextLine();
            if (indiceAlterar < 0 || indiceAlterar >= nomes.size()) {
                System.out.println("Índice inválido. Tente novamente.");
            }
        } while (indiceAlterar < 0 || indiceAlterar >= nomes.size());
        System.out.print("\nDigite o novo nome:");
        String novoNome = sc.nextLine();

        nomes.set(indiceAlterar, novoNome);
        System.out.println("Nome alterado com sucesso!");

        // Removendo
        int indice;
        do{
            System.out.print("\nDigite o índice do nome que deseja remover (0 a " + (nomes.size() - 1) + "):");
            indice = sc.nextInt();
            sc.nextLine();
            if (indice < 0 || indice >= nomes.size()) {
                System.out.println("Índice inválido. Tente novamente.");
            }
        } while (indice < 0 || indice >= nomes.size());
        nomes.remove(indice);
        System.out.println("Nome removido com sucesso!");

        for (String nome : nomes) {
            System.out.println(nome);
        }
        sc.close();
    }
}
