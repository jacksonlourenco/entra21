package exercicios_poo.Mercado3;

public class Mercado {
    public String nome;
    public int qntMacaVendida;
    public double valorMaca;
    public int qntLaranjaVendida;
    public double valorLaranja;

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

    public String receitaLojaMacas(Mercado[] mercados) {
        String nome = "";
        double maiorReceita = 0;

        for (int i = 0; i < mercados.length; i++) {
            double receitaMaca = mercados[i].maiorReceitaMacas();

            if (maiorReceita < receitaMaca) {
                maiorReceita = receitaMaca;
                nome = mercados[i].nome;
            }

        }

        return nome;
    }
    
}
