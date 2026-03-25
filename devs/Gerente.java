public class Gerente extends Funcionario {
    private double bonus = 2000.0;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}