package exercicios_r_poo.Floricultura;

public class Floricultura {
    private String flor;
    private String cliente;
    private double preco;
    private boolean presente;

    public Floricultura(String cliente, String flor, double preco, boolean presente) {
        this.cliente = cliente;
        this.flor = flor;
        this.preco = preco;
        this.presente = presente;
    }

    public String getFlor() {
        return flor;
    }

    public void setFlor(String flor) {
        this.flor = flor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    @Override
    public String toString() {
        return "Floricultura [flor=" + flor + ", cliente=" + cliente + ", preco=" + preco + ", presente=" + presente
                + "]";
    }

}
