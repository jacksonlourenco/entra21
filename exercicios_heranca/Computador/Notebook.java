package exercicios_heranca.Computador;

public class Notebook extends Computador {
    private double peso;

    public Notebook(double peso, int armazenamento, String modelo, int ram) {
        super(armazenamento, modelo, ram);
        setPeso(peso);
    }

    @Override
    public String ligarOuDesligar(boolean ligado) {
        if (ligado) {
            return "Ligando";
        }
        return "desligando";
    }

    @Override
    public boolean rodarAplicacao() {
        return true;
    }

    public void aumentarRam(int ram) {
        setRam(getRam() + ram);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
