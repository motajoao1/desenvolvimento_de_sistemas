abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    // Construtor com validações
    public Funcionario(String nome, double salarioBase) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do funcionário não pode ser vazio.");
        }
        if (salarioBase < 0) {
            throw new IllegalArgumentException("O salário base não pode ser negativo.");
        }
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método abstrato
    public abstract double calcularSalario();

    // Método para exibir os dados
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ " + String.format("%.2f", salarioBase));
        System.out.println("Salário Final: R$ " + String.format("%.2f", calcularSalario()));
    }
}

// 2. Classes filhas
class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase); // Chama o construtor da classe pai para validar os dados
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 2000.00;
    }
}

class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        if (comissao < 0) {
            throw new IllegalArgumentException("A comissão não pode ser negativa.");
        }
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
}
