public class ContaBancaria {
    private String titular;
    private double saldo;

    // Corrigido: saldoInicial sem espaço
    public ContaBancaria(String titular, double saldoInicial) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do titular não pode estar vazio.");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso!");
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular + " | Saldo Atual: R$ " + String.format("%.2f", saldo));
    }

    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
}