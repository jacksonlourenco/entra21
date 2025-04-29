package exercicios_poo.Mercado;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        Mercado un1 = new Mercado("Unidade Blumenau", 4000, 0.4, 2900, 0.7);

        Mercado un2 = new Mercado("Unidade de Joinville", 1000, 0.55, 2500, 1); 

        Mercado un3 = new Mercado("Unidade de Florianópolis", 5000, 1, 7800, 1.5); 


        //Quem teve a maior receita vendendo maças
        if(un1.maiorReceitaMacas() > un2.maiorReceitaMacas() && un1.maiorReceitaMacas() > un3.maiorReceitaMacas()) {
            System.out.println("A unidade de: " + un1.nome + " possui a maior receita.");
        } else if (un2.maiorReceitaMacas() > un1.maiorReceitaMacas() && un2.maiorReceitaMacas() > un3.maiorReceitaMacas()) {
            System.out.println("A unidade de: " + un2.nome + " possui a maior receita.");
        } else if (un3.maiorReceitaMacas() > un1.maiorReceitaMacas() && un3.maiorReceitaMacas() > un2.maiorReceitaMacas()) {
            System.out.println("A unidade de: " + un3.nome + " possui a maior receita.");
        } else {
            System.out.println("Todas possuem a mesma receita.");
        }


    }

    public static double valorLucrado(int vendas, double valor) {
        return vendas * valor;
    }
}
