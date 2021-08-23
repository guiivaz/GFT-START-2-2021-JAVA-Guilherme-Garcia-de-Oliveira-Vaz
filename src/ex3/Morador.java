package ex3;

public class Morador {
    private String telefone;
    private int numResidencia;
    private boolean temCachorro = false;


    public Morador(String telefone, int numResidencia) {
        this.telefone = telefone;
        this.numResidencia = numResidencia;
    }

    public int getNumResidencia() {
        return numResidencia;
    }

    public void setNumResidencia(int numResidencia) {
        this.numResidencia = numResidencia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void temCahorro() {
        temCachorro = true;
    }
}
