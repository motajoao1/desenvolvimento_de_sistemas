import java.util.Scanner;

public class RoadTrip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] onibus = new int[4];
        int[] assentos = new int[4];

        String[] passageiros = new String[20];
        int[] reservaOnibus = new int[20];

        int qtdOnibus;
        int totalReservas = 0;
        int opcao;

        boolean onibusRegistrado = false;
        boolean assentosRegistrados = false;

        System.out.print("Informe a quantidade de ônibus (máx 4): ");
        qtdOnibus = sc.nextInt();

        if (qtdOnibus > 4) {
            System.out.println("Não é permitido cadastrar mais de 4 ônibus.");
            return;
        }

        do {

            System.out.println("\nMENU");
            System.out.println("1 - Registrar ônibus");
            System.out.println("2 - Registrar assentos");
            System.out.println("3 - Reservar passagem");
            System.out.println("4 - Consultar por ônibus");
            System.out.println("5 - Consultar por passageiro");
            System.out.println("6 - Encerrar");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    for (int i = 0; i < qtdOnibus; i++) {
                        System.out.print("Número do ônibus: ");
                        onibus[i] = sc.nextInt();
                    }

                    onibusRegistrado = true;

                    break;

                case 2:

                    if (!onibusRegistrado) {
                        System.out.println("Primeiro registre os ônibus!");
                        break;
                    }

                    for (int i = 0; i < qtdOnibus; i++) {
                        System.out.print("Assentos do ônibus " + onibus[i] + ": ");
                        assentos[i] = sc.nextInt();
                    }

                    assentosRegistrados = true;

                    break;

                case 3:

                    if (!onibusRegistrado || !assentosRegistrados) {
                        System.out.println("Registre os ônibus e os assentos primeiro!");
                        break;
                    }

                    if (totalReservas >= 20) {
                        System.out.println("Limite máximo de reservas atingido!");
                        break;
                    }

                    System.out.print("Número do ônibus: ");
                    int num = sc.nextInt();

                    int indice = -1;

                    for (int i = 0; i < qtdOnibus; i++) {
                        if (onibus[i] == num) {
                            indice = i;
                        }
                    }

                    if (indice == -1) {
                        System.out.println("Este ônibus não existe!");
                        break;
                    }

                    if (assentos[indice] == 0) {
                        System.out.println("Não há assentos disponíveis para este ônibus!");
                        break;
                    }

                    sc.nextLine();

                    System.out.print("Nome do passageiro: ");
                    passageiros[totalReservas] = sc.nextLine();

                    reservaOnibus[totalReservas] = num;

                    assentos[indice]--;
                    totalReservas++;

                    System.out.println("Reserva realizada com sucesso!");

                    break;

                case 4:

                    System.out.print("Número do ônibus: ");
                    int consulta = sc.nextInt();

                    boolean encontrou = false;

                    for (int i = 0; i < qtdOnibus; i++) {
                        if (onibus[i] == consulta) {

                            for (int j = 0; j < totalReservas; j++) {
                                if (reservaOnibus[j] == consulta) {
                                    System.out.println("Passageiro: " + passageiros[j]);
                                    encontrou = true;
                                }
                            }

                            if (!encontrou) {
                                System.out.println("Não há reservas realizadas para este ônibus!");
                            }

                        }
                    }

                    break;

                case 5:

                    sc.nextLine();
                    System.out.print("Nome do passageiro: ");
                    String nome = sc.nextLine();

                    boolean achou = false;

                    for (int i = 0; i < totalReservas; i++) {

                        if (passageiros[i].equalsIgnoreCase(nome)) {
                            System.out.println("Ônibus: " + reservaOnibus[i]);
                            achou = true;
                        }

                    }

                    if (!achou) {
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }

                    break;

                case 6:

                    System.out.println("Sistema encerrado");

                    break;

                default:

                    System.out.println("Opção inválida!");

            }

        } while (opcao != 6);

    }
}