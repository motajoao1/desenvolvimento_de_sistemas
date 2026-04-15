import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaAutomotivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Veiculo> frota = new ArrayList<>();

        System.out.println("--- Sistema de Cadastro de Veículos ---");

        while (true) {
            try {
                System.out.print("\nDigite o modelo do veículo (ou 'sair' para finalizar): ");
                String modelo = scanner.nextLine();

                if (modelo.equalsIgnoreCase("sair")) {
                    if (frota.isEmpty()) {
                        System.out.println("Atenção: É necessário cadastrar pelo menos 1 veículo antes de sair.");
                        continue;
                    }
                    break;
                }

                if (modelo.trim().isEmpty()) {
                    throw new IllegalArgumentException("O modelo não pode ser vazio.");
                }

                System.out.print("Digite o ano do veículo: ");
                int ano = scanner.nextInt();
                scanner.nextLine(); 

                if (ano < 2000) {
                    throw new IllegalArgumentException("O ano não pode ser menor que 2000.");
                }

                System.out.print("O veículo é um Carro ou Moto? (C/M): ");
                String tipo = scanner.nextLine().toUpperCase();

                if (tipo.equals("C")) {
                    frota.add(new Carro(modelo, ano));
                    System.out.println("Carro cadastrado com sucesso!");
                } else if (tipo.equals("M")) {
                    frota.add(new Moto(modelo, ano));
                    System.out.println("Moto cadastrada com sucesso!");
                } else {
                    System.out.println("Erro: Tipo de veículo inválido.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro de entrada: Digite um número inteiro válido para o ano.");
                scanner.nextLine(); 
            } catch (IllegalArgumentException e) {
                System.out.println("Erro de validação: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        System.out.println("\n--- Veículos Cadastrados ---");
        for (Veiculo v : frota) {
            v.exibir();
            System.out.println("----------------------------");
        }

        scanner.close();
    }
}