package exercicios_poo.Mercado2;

public class Mercado {
    public String nome;
    public int qntMacaVendida;
    public double valorMaca;
    public int qntLaranjaVendida;
    public double valorLaranja;

    public double calcularReceita() {

        double receitaMaca = qntMacaVendida * valorMaca;
        double receitaLaranja = qntLaranjaVendida * valorLaranja;

        return receitaMaca + receitaLaranja;
    }

    public double calcularMacas() {
        return qntMacaVendida * valorMaca;
    }

    public double calcularLaranjas() {
        return qntLaranjaVendida * valorLaranja;
    }
}
