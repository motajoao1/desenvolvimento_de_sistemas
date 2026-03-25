public class Tecnico extends Funcionario {
    private double adicional = 1000.0;

    public Tecnico(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + adicional;
    }
}