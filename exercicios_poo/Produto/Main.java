package exercicios_poo.Produto;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Produto p1 = new Produto();

        p1.nome = "Caderno";
        p1.descricao = "Caderno em espiral tam. médio";
        p1.precoUnitario = 7;
        p1.desconto = 15;

        System.out.println("Produto:" + p1.nome
                + "\nDescição: " + p1.descricao
                + "\nPreço unitário: R$" + p1.precoUnitario
                + "\nValor com desconto: R$" + df.format(calcularDesconto(p1.precoUnitario, p1.desconto)));
    }

    public static double calcularDesconto(double valor, int desconto) {
        double descontoPercentual = 1 - (desconto / 100.0);
        return valor * descontoPercentual;
    }
}
