public class Gato extends Animal {
    
    public Gato() {
        super("Gato");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }
}