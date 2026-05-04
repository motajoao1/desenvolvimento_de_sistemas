import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String exibirDetalhes() {
        return "Marca: " + marca + "\n" +
               "Modelo: " + modelo + "\n" +
               "Ano: " + ano;
    }
}

class Carro extends Veiculo {
    
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public String exibirDetalhes() {
        return "🚗 --- Detalhes do Carro ---\n" + super.exibirDetalhes();
    }
}

public class SistemaCarros {
    
    private static ArrayList<Carro> listaCarros = new ArrayList<>();

    public static void main(String[] args) {
        String menu = "Escolha uma opção:\n\n" +
                      "1 - Cadastrar Carro\n" +
                      "2 - Listar Carros\n" +
                      "3 - Detalhar Carro\n" +
                      "4 - Alterar Carro\n" +
                      "5 - Remover Carro\n" +
                      "6 - Gravar Informações em Arquivo\n" +
                      "7 - Sair";

        boolean rodando = true;

        while (rodando) {
            String opcaoStr = JOptionPane.showInputDialog(null, menu, "Sistema de Gerenciamento de Carros", JOptionPane.PLAIN_MESSAGE);

            if (opcaoStr == null) {
                break;
            }

            try {
                int opcao = Integer.parseInt(opcaoStr);

                switch (opcao) {
                    case 1:
                        cadastrarCarro();
                        break;
                    case 2:
                        listarCarros();
                        break;
                    case 3:
                        detalharCarro();
                        break;
                    case 4:
                        alterarCarro();
                        break;
                    case 5:
                        removerCarro();
                        break;
                    case 6:
                        gravarArquivo();
                        break;
                    case 7:
                        rodando = false;
                        JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite apenas números válidos para o menu.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // 1 - Cadastrar Carro
    private static void cadastrarCarro() {
        try {
            String marca = JOptionPane.showInputDialog("Digite a marca do carro:");
            if (marca == null) return;

            String modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
            if (modelo == null) return;

            String anoStr = JOptionPane.showInputDialog("Digite o ano do carro:");
            if (anoStr == null) return;
            int ano = Integer.parseInt(anoStr);

            Carro novoCarro = new Carro(marca, modelo, ano);
            listaCarros.add(novoCarro);
            
            JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ano inválido! Cadastro cancelado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // 2 - Listar Carros
    private static void listarCarros() {
        if (listaCarros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.", "Lista Vazia", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder lista = new StringBuilder("Lista de Carros Cadastrados:\n\n");
        for (int i = 0; i < listaCarros.size(); i++) {
            Carro c = listaCarros.get(i);
            lista.append("[").append(i).append("] - ")
                 .append(c.getMarca()).append(" ")
                 .append(c.getModelo()).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, lista.toString(), "Carros", JOptionPane.INFORMATION_MESSAGE);
    }

    // 3 - Detalhar Carro
    private static void detalharCarro() {
        int indice = solicitarIndice("detalhar");
        if (indice != -1) {
            Carro c = listaCarros.get(indice);
            JOptionPane.showMessageDialog(null, c.exibirDetalhes(), "Detalhes", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // 4 - Alterar Carro
    private static void alterarCarro() {
        int indice = solicitarIndice("alterar");
        if (indice != -1) {
            try {
                String marca = JOptionPane.showInputDialog("Digite a NOVA marca do carro:", listaCarros.get(indice).getMarca());
                if (marca == null) return;

                String modelo = JOptionPane.showInputDialog("Digite o NOVO modelo do carro:", listaCarros.get(indice).getModelo());
                if (modelo == null) return;

                String anoStr = JOptionPane.showInputDialog("Digite o NOVO ano do carro:", listaCarros.get(indice).getAno());
                if (anoStr == null) return;
                int ano = Integer.parseInt(anoStr);

                // Substitui o carro antigo pelo novo na mesma posição
                listaCarros.set(indice, new Carro(marca, modelo, ano));
                JOptionPane.showMessageDialog(null, "Carro alterado com sucesso!");

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ano inválido! Alteração cancelada.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // 5 - Remover Carro
    private static void removerCarro() {
        int indice = solicitarIndice("remover");
        if (indice != -1) {
            listaCarros.remove(indice);
            JOptionPane.showMessageDialog(null, "Carro removido com sucesso!");
        }
    }

    // 6 - Gravar Informações em Arquivo
    private static void gravarArquivo() {
        if (listaCarros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há carros para gravar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("carros.txt"))) {
            writer.println("--- RELATÓRIO DE CARROS CADASTRADOS ---");
            for (Carro c : listaCarros) {
                writer.println("Marca: " + c.getMarca());
                writer.println("Modelo: " + c.getModelo());
                writer.println("Ano: " + c.getAno());
                writer.println("---------------------------------------");
            }
            JOptionPane.showMessageDialog(null, "Dados gravados com sucesso no arquivo 'carros.txt'!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo: " + e.getMessage(), "Erro de IO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static int solicitarIndice(String acao) {
        if (listaCarros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado para " + acao + ".", "Aviso", JOptionPane.WARNING_MESSAGE);
            return -1;
        }
        
        listarCarros(); 
        
        try {
            String indiceStr = JOptionPane.showInputDialog("Digite o número (posição) do carro que deseja " + acao + ":");
            if (indiceStr == null) return -1;
            
            int indice = Integer.parseInt(indiceStr);
            
            if (indice >= 0 && indice < listaCarros.size()) {
                return indice;
            } else {
                JOptionPane.showMessageDialog(null, "Número não encontrado. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                return -1;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }
}