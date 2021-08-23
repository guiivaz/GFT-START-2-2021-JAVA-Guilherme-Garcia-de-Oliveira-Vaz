package ex1;

public class ColaboradorComSuperior extends Colaborador{
    private String universidade;
    public ColaboradorComSuperior(String nome, String matricula) {
        super(nome, matricula);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
}
