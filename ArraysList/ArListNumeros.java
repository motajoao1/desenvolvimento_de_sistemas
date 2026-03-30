package ArraysList;
import java.util.ArrayList;

public class ArListNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        numeros.set(1, 20);

        numeros.remove(2);
        System.out.println("===================");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}