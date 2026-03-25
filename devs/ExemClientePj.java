public class ExemClientePj extends ExemCliente{
    private String cnpj;

    public ExemClientePj (int codigo, String nome, String endereco, String cnpj) {
        super(codigo, nome,endereco);
        this.cnpj=cnpj;
    }
    public String getCnpj (){
        return cnpj;
    }
    public void getCnpj (String cnpj){
        this.cnpj=cnpj;
    }
    public void exibirInfo(){
            super.exibirInfo();
        System.out.println("O cnpj é: " + getCnpj());
        }
    }

