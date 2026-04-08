import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> cadastro = new ArrayList<>();
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n=== SISTEMA DE CADASTRO ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Remover");
            System.out.println("5 - Pesquisar");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine(); 

                    System.out.println("Tipo de cadastro: 1 - Aluno | 2 - Professor");
                    int tipo = sc.nextInt();
                    sc.nextLine(); 

                    if (tipo == 1) {
                        System.out.print("Digite a matrícula: ");
                        String matricula = sc.nextLine();
                        cadastro.add(new Aluno(nome, idade, matricula));
                        System.out.println("Aluno cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        System.out.print("Digite a disciplina: ");
                        String disciplina = sc.nextLine();
                        cadastro.add(new Professor(nome, idade, disciplina));
                        System.out.println("Professor cadastrado com sucesso!");
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Lista de Cadastrados ---");
                    if (cadastro.isEmpty()) {
                        System.out.println("Nenhum cadastro encontrado.");
                    } else {
                        for (Pessoa p : cadastro) {
                            p.exibirDados();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome da pessoa que deseja alterar: ");
                    String nomeAlterar = sc.nextLine();
                    boolean encontrouParaAlterar = false;

                    for (Pessoa p : cadastro) {
                        if (p.getNome().equalsIgnoreCase(nomeAlterar)) {
                            System.out.print("Novo nome: ");
                            p.setNome(sc.nextLine());
                            System.out.print("Nova idade: ");
                            p.setIdade(sc.nextInt());
                            sc.nextLine(); 

                            if (p instanceof Aluno) {
                                System.out.print("Nova matrícula: ");
                                ((Aluno) p).setMatricula(sc.nextLine());
                            } else if (p instanceof Professor) {
                                System.out.print("Nova disciplina: ");
                                ((Professor) p).setDisciplina(sc.nextLine());
                            }
                            System.out.println("Dados alterados com sucesso!");
                            encontrouParaAlterar = true;
                            break;
                        }
                    }
                    if (!encontrouParaAlterar) {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome da pessoa que deseja remover: ");
                    String nomeRemover = sc.nextLine();
                    boolean removido = false;

                    for (int i = 0; i < cadastro.size(); i++) {
                        if (cadastro.get(i).getNome().equalsIgnoreCase(nomeRemover)) {
                            cadastro.remove(i);
                            System.out.println("Cadastro removido com sucesso!");
                            removido = true;
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Pessoa não encontrada para remoção.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome da pessoa para pesquisar: ");
                    String nomePesquisar = sc.nextLine();
                    boolean encontrado = false;

                    for (Pessoa p : cadastro) {
                        if (p.getNome().equalsIgnoreCase(nomePesquisar)) {
                            System.out.println("\n--- Dado Encontrado ---");
                            p.exibirDados();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Pessoa não encontrada no sistema.");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o sistema... Valeu, Jotapê!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        sc.close();
    }
}