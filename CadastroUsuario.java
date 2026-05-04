import javax.swing.JOptionPane;

public class CadastroUsuario {
    public static void main(String[] args) {
        try {
            String nome = JOptionPane.showInputDialog(null, 
                    "Por favor, digite o seu nome:", 
                    "Entrada de Dados", 
                    JOptionPane.QUESTION_MESSAGE);
            
            if (nome == null) {
                System.exit(0);
            }

            String strIdade = JOptionPane.showInputDialog(null, 
                    "Por favor, digite a sua idade:", 
                    "Entrada de Dados", 
                    JOptionPane.QUESTION_MESSAGE);
            
            if (strIdade == null) {
                System.exit(0);
            }

            int idade = Integer.parseInt(strIdade);

            String statusMaioridade;
            if (idade >= 18) {
                statusMaioridade = "maior de idade";
            } else {
                statusMaioridade = "menor de idade";
            }

            String mensagemFinal = "Dados informados:\n" +
                                   "Nome: " + nome + "\n" +
                                   "Idade: " + idade + " anos\n\n" +
                                   "Status: Você é " + statusMaioridade + ".";

            JOptionPane.showMessageDialog(null, 
                    mensagemFinal, 
                    "Resultado", 
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                    "Erro: A idade digitada não é um número válido.", 
                    "Erro de Entrada", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}