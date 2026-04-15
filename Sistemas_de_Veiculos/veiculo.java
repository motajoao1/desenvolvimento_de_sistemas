
abstract class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract double calcularValor();

    public void exibir() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: R$ " + String.format("%.2f", calcularValor()));
    }
}

class Carro extends Veiculo {
    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public double calcularValor() {
        return 30000.00;
    }
}

class Moto extends Veiculo {
    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public double calcularValor() {
        return 15000.00;
    }
}