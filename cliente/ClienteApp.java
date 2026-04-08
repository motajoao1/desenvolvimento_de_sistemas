public class ClienteApp {

    public static void main(String[] args) {
        ClientePf pf = new ClientePf("Carlos", "Rua A", "888.888.888-88");

        ClientePj pj = new ClientePj("AAPetiscos", "Rua B", "5555555/000189");

        System.out.println("Cliente Pf: " + pf.getNome());
        System.out.println("Cliente Pj: " + pj.getEndereco());

        pf.atualizarDados(null, null);
        pj.atualizarNome(null);

        System.out.println();
    }
    
}