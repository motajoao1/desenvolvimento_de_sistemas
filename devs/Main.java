public class Main {
    public static void main(String[] args) {
        Funcionario funcionarioPadrao = new Funcionario("Ana Silva", 3000.0);
        Gerente gerente = new Gerente("Carlos Souza", 5000.0);
        Tecnico tecnico = new Tecnico("Marcos Santos", 2500.0);

        System.out.println("--- Sistema de Cadastro de Funcionários ---");
        
        System.out.println("Funcionário: " + funcionarioPadrao.getNome());
        System.out.println("Salário Final: R$ " + funcionarioPadrao.calcularSalario());
        System.out.println("-------------------------------------------");

        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Salário Final: R$ " + gerente.calcularSalario());
        System.out.println("-------------------------------------------");

        System.out.println("Técnico: " + tecnico.getNome());
        System.out.println("Salário Final: R$ " + tecnico.calcularSalario()); 
        System.out.println("-------------------------------------------");
    }
}