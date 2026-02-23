import java.util.Locale;

public class VariableExemplo {
    public static void main(String[] args){
        double x =10.35784;

        System.out.println(x);
        System.out.printf("O valor de x é %.1f%n", x); // Formatação com uma casa decimal
        System.out.printf("O valor de x é %.3f%n", x); // Formatação para três casas decimais para Brasil
        Locale.setDefault(Locale.US);
        System.out.printf("O valor de x é %.4f%n", x);// Formatação para quatro casas decimais para EUA

        System.out.println("Resultado = " + x + " metros"); // Concatenação simples
        System.out.printf("Resultado = %.2f metros%n", x); // Conatenação formatada com duas casas decimais
    }
}