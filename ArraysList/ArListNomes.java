package ArraysList;
import java.util.ArrayList;

public class ArListNomes {
    public static void main(String[] args) {

        // Adicionando elementos a um ArrayList
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Amanda");
        nomes.add("Mariana Victoria");
        nomes.add("Emy");

        // Listando os elementos do ArrayList
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        // Alterando um elemento do ArrayList
        nomes.set(1, "Amanda Medina");
        
        // Removendo um elemento do ArrayList
        nomes.remove(2);
        
        System.out.println("===================");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}