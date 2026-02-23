import java.util.Scanner;

public class ExerciciosCondicionais {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1 - Positivo, Negativo ou Nulo
        int numero1 = sc.nextInt();

        if (numero1 > 0) {
            System.out.println("Positivo");
        } else if (numero1 < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Nulo");
        }

        // 2 - Par ou Ímpar
        int numero2 = sc.nextInt();

        if (numero2 % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        // 3 - Faixa Etária
        int idade1 = sc.nextInt();

        if (idade1 >= 0 && idade1 <= 12) {
            System.out.println("Criança");
        } else if (idade1 >= 13 && idade1 <= 17) {
            System.out.println("Adolescente");
        } else if (idade1 >= 18 && idade1 <= 59) {
            System.out.println("Adulto");
        } else if (idade1 >= 60) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade inválida");
        }

        // 4 - Maior de Idade
        int idade2 = sc.nextInt();

        if (idade2 >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }

        // 5 - Controle de Acesso da Porta
        String SENHA_SISTEMA = "Jotape123";
        String senha = sc.next();

        if (senha.equals(SENHA_SISTEMA)) {
            System.out.println("PORTA ABERTA");
        } else {
            System.out.println("SENHA NAO CONFERE");
        }

        // 6 - Operação Aritmética
        double operando1 = sc.nextDouble();
        double operando2 = sc.nextDouble();
        char operador = sc.next().charAt(0);

        double resultado;

        switch (operador) {
            case '+':
                resultado = operando1 + operando2;
                System.out.println(resultado);
                break;
            case '-':
                resultado = operando1 - operando2;
                System.out.println(resultado);
                break;
            case '*':
                resultado = operando1 * operando2;
                System.out.println(resultado);
                break;
            case '/':
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                    System.out.println(resultado);
                } else {
                    System.out.println("Erro: divisão por zero");
                }
                break;
            default:
                System.out.println("Operador inválido");
        }

        // 7 - Loja de CDs
        String cor = sc.next().toUpperCase();

        if (cor.equals("VERDE")) {
            System.out.println("Preço: R$ 10,00");
        } else if (cor.equals("AZUL")) {
            System.out.println("Preço: R$ 20,00");
        } else if (cor.equals("AMARELO")) {
            System.out.println("Preço: R$ 30,00");
        } else if (cor.equals("VERMELHO")) {
            System.out.println("Preço: R$ 40,00");
        } else {
            System.out.println("Cor não encontrada na tabela de preços");
        }

        sc.close();
    }
}