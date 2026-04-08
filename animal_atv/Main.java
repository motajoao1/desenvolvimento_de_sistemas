import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> animaisCadastrados = new ArrayList<>();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar novo animal");
            System.out.println("2 - Fazer um animal emitir som");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("\nQual animal deseja adicionar?");
                System.out.println("1 - Cachorro");
                System.out.println("2 - Gato");
                System.out.print("Sua escolha: ");
                int tipoAnimal = sc.nextInt();

                if (tipoAnimal == 1) {
                    animaisCadastrados.add(new Cachorro());
                    System.out.println("Cachorro cadastrado com sucesso!");
                } else if (tipoAnimal == 2) {
                    animaisCadastrados.add(new Gato());
                    System.out.println("Gato cadastrado com sucesso!");
                } else {
                    System.out.println("Opção inválida.");
                }

            } else if (opcao == 2) {
                if (animaisCadastrados.isEmpty()) {
                    System.out.println("\nNenhum animal cadastrado ainda!");
                } else {
                    System.out.println("\n--- Lista de Animais ---");
                    for (int i = 0; i < animaisCadastrados.size(); i++) {
                        System.out.println((i + 1) + " - " + animaisCadastrados.get(i).getNomeTipo());
                    }
                    
                    System.out.print("Escolha o número do animal para ouvir o som: ");
                    int indiceEscolhido = sc.nextInt();
                    
                    int posicaoRealNaLista = indiceEscolhido - 1;

                    if (posicaoRealNaLista >= 0 && posicaoRealNaLista < animaisCadastrados.size()) {
                        System.out.print("Som: ");
                        animaisCadastrados.get(posicaoRealNaLista).fazerSom();
                    } else {
                        System.out.println("Número de animal não encontrado na lista.");
                    }
                }

            } else if (opcao == 3) {
                System.out.println("\nEncerrando o programa...");
            } else {
                System.out.println("\nOpção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}