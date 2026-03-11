import java.util.Scanner;

public class RoadTrip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maxOnibus = 4;
        int maxReservas = 20;

        int qtdOnibus;
        int[] numeroOnibus = new int[maxOnibus];
        int[] assentos = new int[maxOnibus];

        String[] passageiros = new String[maxReservas];
        int[] onibusReserva = new int[maxReservas];

        int totalReservas = 0;

        boolean onibusRegistrado = false;
        boolean assentosRegistrados = false;

        System.out.print("Informe a quantidade de ônibus disponíveis (máx 4): ");
        qtdOnibus = sc.nextInt();

        if (qtdOnibus > 4) {
            System.out.println("Não é permitido cadastrar mais de 4 ônibus.");
            return;
        }

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Registrar número dos ônibus");
            System.out.println("2 - Registrar assentos dos ônibus");
            System.out.println("3 - Reservar passagem");
            System.out.println("4 - Consultar por ônibus");
            System.out.println("5 - Consultar por passageiro");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    for (int i = 0; i < qtdOnibus; i++) {
                        System.out.print("Informe o número do ônibus " + (i + 1) + ": ");
                        numeroOnibus[i] = sc.nextInt();
                    }
                    onibusRegistrado = true;
                    break;

                case 2:

                    if (!onibusRegistrado) {
                        System.out.println("Primeiro registre os ônibus!");
                        break;
                    }

                    for (int i = 0; i < qtdOnibus; i++) {
                        System.out.print("Informe a quantidade de assentos do ônibus " + numeroOnibus[i] + ": ");
                        assentos[i] = sc.nextInt();
                    }
                    assentosRegistrados = true;
                    break;

                case 3:

                    if (!onibusRegistrado || !assentosRegistrados) {
                        System.out.println("Registre os ônibus e os assentos primeiro!");
                        break;
                    }

                    if (totalReservas >= maxReservas) {
                        System.out.println("Limite máximo de reservas atingido!");
                        break;
                    }

                    System.out.print("Informe o número do ônibus: ");
                    int num = sc.nextInt();
                    sc.nextLine();

                    int indice = -1;

                    for (int i = 0; i < qtdOnibus; i++) {
                        if (numeroOnibus[i] == num) {
                            indice = i;
                            break;
                        }
                    }

                    if (indice == -1) {
                        System.out.println("Este ônibus não existe!");
                        break;
                    }

                    if (assentos[indice] <= 0) {
                        System.out.println("Não há assentos disponíveis para este ônibus!");
                        break;
                    }

                    System.out.print("Informe o nome do passageiro: ");
                    passageiros[totalReservas] = sc.nextLine();
                    onibusReserva[totalReservas] = num;

                    assentos[indice]--;
                    totalReservas++;

                    System.out.println("Reserva realizada com sucesso!");
                    break;

                case 4:

                    if (!onibusRegistrado) {
                        System.out.println("Primeiro registre os ônibus!");
                        break;
                    }

                    System.out.print("Informe o número do ônibus: ");
                    int consultaOnibus = sc.nextInt();

                    boolean existe = false;
                    boolean encontrouReserva = false;

                    for (int i = 0; i < qtdOnibus; i++) {
                        if (numeroOnibus[i] == consultaOnibus) {
                            existe = true;
                            break;
                        }
                    }

                    if (!existe) {
                        System.out.println("Este ônibus não existe!");
                        break;
                    }

                    for (int i = 0; i < totalReservas; i++) {
                        if (onibusReserva[i] == consultaOnibus) {
                            System.out.println("Passageiro: " + passageiros[i]);
                            encontrouReserva = true;
                        }
                    }

                    if (!encontrouReserva) {
                        System.out.println("Não há reservas realizadas para este ônibus!");
                    }

                    break;

                case 5:

                    System.out.print("Informe o nome do passageiro: ");
                    String nomeBusca = sc.nextLine();

                    boolean encontrou = false;

                    for (int i = 0; i < totalReservas; i++) {
                        if (passageiros[i].equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Reserva no ônibus: " + onibusReserva[i]);
                            encontrou = true;
                        }
                    }

                    if (!encontrou) {
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }

                    break;

                case 6:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}