public class ExemCliente {
    private int codigo;
    private String nome;
    private String endereco;

    public ExemCliente(int codigo, String nome, String endereco) {
        this.codigo=codigo;
        this.nome=nome;
        this.endereco=endereco;

    }

    public int getCodigo(){
        return codigo;
    }
    public void getCodigo(int codigo) {
        this.codigo=codigo;
    } 

    public String getNome() {
        return nome;
    }
    public void getNome(String nome){
        this.nome=nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void getEndereco(String endereco) {
        this.endereco=endereco;
    }

    public void exibirInfo(){
        System.out.println("Seu código é: "+getCodigo());
        System.out.println("Seu nome é: "+getNome());
        System.out.println("Seu endereço é: "+getEndereco());
    }
}