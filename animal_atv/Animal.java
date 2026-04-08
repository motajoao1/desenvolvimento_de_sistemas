public abstract class Animal {
    private String nomeTipo;

    public Animal(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public abstract void fazerSom();
}