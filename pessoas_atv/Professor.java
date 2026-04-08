public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        System.out.println("[Professor] Nome: " + getNome() + " | Idade: " + getIdade() + " | Disciplina: " + disciplina);
    }
}