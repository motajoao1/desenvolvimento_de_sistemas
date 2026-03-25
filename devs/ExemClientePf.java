public class ExemClientePf extends ExemCliente {
    private String cpf;

    public ExemClientePf (int codigo, String nome, String endereco, String cpf){
        super(codigo, nome, endereco);
        this.cpf=cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void getCpf (String cpf){
        this.cpf=cpf;
    }
    public void exibirInfo(){
         super.exibirInfo();
        System.out.println("O cpf é: " +getCpf());
    }
}
