package ex1;

public class ColaboradorComBasico extends Colaborador{
    private String escola;
    ColaboradorComBasico(String nome, String matricula, String escola) {
        super(nome, matricula);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
}

