public class Cachorro extends Animal {
    
    public Cachorro() {
        super("Cachorro"); 
    }

    @Override
    public void fazerSom() {
        System.out.println("AU AU!");
    }
}