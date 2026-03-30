import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Anderson");
        nomes.add("Vanessa");
        nomes.add("Carla");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println((i + 1) + " - " + nomes.get(i));
        }

        // Corrigido: sintaxe do set
        nomes.set(2, "edivandecidecleide");

        nomes.remove("Carla"); // Isso não vai remover mais nada, pois já foi substituído

        System.out.println("=================");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}