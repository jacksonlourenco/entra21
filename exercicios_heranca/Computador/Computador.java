package exercicios_heranca.Computador;

public abstract class Computador {
    private String modelo;
    private int ram;
    private int armazenamento;

    public Computador(int armazenamento, String modelo, int ram) {
        setArmazenamento(armazenamento);
        setModelo(modelo);
        setRam(ram);
    }

    public abstract String ligarOuDesligar(boolean ligado);

    public abstract boolean rodarAplicacao();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

}
