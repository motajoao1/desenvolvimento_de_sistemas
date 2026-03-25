public class SistemaVeiculos {
    public static void main(String[] args) {
       
        Carro meuCarro = new Carro("Toyota", 2023, 4);
        Moto minhaMoto = new Moto("Honda", 2021, 600);

        System.out.println("--- Informações do Carro ---");
        meuCarro.exibirInfo();

        System.out.println("\n--- Informações da Moto ---");
        minhaMoto.exibirInfo();
    }
}