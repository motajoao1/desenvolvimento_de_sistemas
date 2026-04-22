public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        validarNome(nome);
        validarPreco(preco);
        validarQuantidade(quantidade);
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos de validação para evitar repetição de código
    private void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode estar vazio.");
        }
    }

    private void validarPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero.");
        }
    }

    private void validarQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa.");
        }
    }

    public void exibirDados() {
        System.out.println("Produto: " + nome + 
                           " | Preço: R$ " + String.format("%.2f", preco) + 
                           " | Estoque: " + quantidade);
    }

    // Getters e Setters com validação
    public String getNome() { return nome; }
    public void setNome(String nome) { 
        validarNome(nome);
        this.nome = nome; 
    }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { 
        validarPreco(preco);
        this.preco = preco; 
    }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { 
        validarQuantidade(quantidade);
        this.quantidade = quantidade; 
    }
}