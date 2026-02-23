public class ImparesEPares {
    public static void main(String[] args) {

        System.out.println("Ímpares de 1 a 51:");
        for (int i = 1; i <= 51; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nPares de 52 a 100:");
        for (int i = 52; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}