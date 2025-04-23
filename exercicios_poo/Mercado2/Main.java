package exercicios_poo.Mercado2;

import java.text.DecimalFormat;

public class Main {
        public static void main(String[] args) {
                DecimalFormat df = new DecimalFormat("0.00");

                Mercado[] mercados = new Mercado[3];
                mercados[0] = new Mercado();
                mercados[1] = new Mercado();
                mercados[2] = new Mercado();

                mercados[0].nome = "Unidade Blumenau";
                mercados[0].qntMacaVendida = 4000;
                mercados[0].valorMaca = 0.4;
                mercados[0].qntLaranjaVendida = 2900;
                mercados[0].valorLaranja = 0.67;

                mercados[1].nome = "Unidade de Joinville";
                mercados[1].qntMacaVendida = 1000;
                mercados[1].valorMaca = 0.55;
                mercados[1].qntLaranjaVendida = 2500;
                mercados[1].valorLaranja = 1;

                mercados[2].nome = "Unidade de Florianópolis";
                mercados[2].qntMacaVendida = 5000;
                mercados[2].valorMaca = 1;
                mercados[2].qntLaranjaVendida = 6500;
                mercados[2].valorLaranja = 1.5;

                System.out
                                .println("A) Quem teve a maior receita vendendo maçãs? "
                                                + VerificarReceita.maiorReceitaMaca(mercados));

                System.out
                                .println("B) Quem teve a maior receita vendendo laranjas? "
                                                + VerificarReceita.maiorReceitaLaranja(mercados));

                System.out
                                .println("C) Qual das lojas teve a maior receita? "
                                                + VerificarReceita.maiorReceitaLojas(mercados));

                System.out
                                .println("D) Qual das lojas teve a menor receita? "
                                                + VerificarReceita.menorReceitaLojas(mercados));

                System.out
                                .println("E) Qual das lojas ficou no \"meio\" em termos de receita? "
                                                + VerificarReceita.meioReceitaLojas(mercados));
        }

}
