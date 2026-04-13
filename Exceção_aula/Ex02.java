public class Ex02 { 
    public static void main(String[] args) {
        int[] numeros = {28, 29, 30};

        try {
            System.out.println(numeros[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Indice fora do limite do Array");
        } 
        finally {
            System.out.println("Fim do programa");
        }
    }
}