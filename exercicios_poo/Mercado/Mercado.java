package exercicios_poo.Mercado;

public class Mercado {
    String nome;
    int qntMacaVendida;
    double valorMaca;
    int qntLaranjaVendida;
    double valorLaranja;

    public Mercado(String nome, int qntMacaVendida, double valorMaca, int qntLaranjaVendida, double valorLaranja) {
        this.nome = nome;
        this.qntMacaVendida = qntMacaVendida;
        this.valorMaca = valorMaca;
        this.qntLaranjaVendida = qntLaranjaVendida;
        this.valorLaranja = valorLaranja;
    }

    public double maiorReceitaMacas() {
        return qntMacaVendida * valorMaca;
    }

}
