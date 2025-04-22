package exercicios_poo.Mercado2;

import exercicios_poo.Mercado.*;

public class MaiorReceitaMaca {

    public static String maiorReceitaMaca(Mercado[] mercados) {
        double maiorVenda = 0;
        String nomeMercado = "";

        for (int i = 0; i < mercados.length; i++) {
            double receita = mercados[i].calcularMacas();

            if (receita > maiorVenda) {
                maiorVenda = receita;
                nomeMercado = mercados[i].nome;
            }
        }

        return nomeMercado;
    }
}