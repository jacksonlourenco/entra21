package exercicios_poo.Mercado;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        Mercado un1 = new Mercado();
        un1.nome = "Unidade Blumenau";
        un1.qntMacaVendida = 4000;
        un1.valorMaca = 0.4;
        un1.qntLaranjaVendida = 2900;
        un1.valorLaranja = 0.67;

        System.out.println("O mercado: " + un1.nome + ", vendeu " + un1.qntMacaVendida +
                " maças no ano, lucrando: R$" + df.format(valorLucrado(un1.qntMacaVendida, un1.valorMaca))
                + " e vendeu " + un1.qntLaranjaVendida + " laranjas no ano, com o lucro de: R$" +
                df.format(valorLucrado(un1.qntLaranjaVendida, un1.valorLaranja)));
        System.out.println();

        Mercado un2 = new Mercado();
        un2.nome = "Unidade de Joinville";
        un2.qntMacaVendida = 1000;
        un2.valorMaca = 0.55;
        un2.qntLaranjaVendida = 2500;
        un2.valorLaranja = 1;
        System.out.println("O mercado: " + un2.nome + " vendeu " + un2.qntMacaVendida + " Maças por R$" + un2.valorMaca
                + "/un. E vendeu " + un2.qntLaranjaVendida + " Laranjas por R$" + un2.valorLaranja + "/un");
        System.out.println();

        Mercado un3 = new Mercado();
        un3.nome = "Unidade de Florianópolis";
        un3.qntMacaVendida = 5000;
        un3.valorMaca = 1;
        un3.qntLaranjaVendida = 6500;
        un3.valorLaranja = 1.5;
        System.out.println("O mercado: " + un3.nome + ", vendeu " + un3.qntMacaVendida +
                " maças no ano, lucrando: R$" + df.format(valorLucrado(un3.qntMacaVendida, un3.valorMaca))
                + " e vendeu " + un3.qntLaranjaVendida + " laranjas no ano, com o lucro de: R$" +
                df.format(valorLucrado(un3.qntLaranjaVendida, un3.valorLaranja)));

    }

    public static double valorLucrado(int vendas, double valor) {
        return vendas * valor;
    }
}
