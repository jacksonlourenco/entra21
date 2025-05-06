package exercicios_r_poo.Material_Construcao;

import java.util.List;

public class VerificarInfo {

    public static String verificarMaterialCaro(List<Produtos> produtos) {
        double materialCaro = 0;
        String nomeMaterial = "";

        for (Produtos p : produtos) {
            if (p.getPreco() > materialCaro) {
                materialCaro = p.getPreco();
                nomeMaterial = p.getNome();
            }
        }

        return "O material mais caro é: " + nomeMaterial + " com o valor de: R$ " + materialCaro;
    }

    public static String verificarMaterialPorMetro(List<Produtos> produtos) {
        double valorMetro = 0;
        String nome = "";

        for (Produtos p : produtos) {
            double valorMetroP = p.getPreco() / p.getVolume();

            if (valorMetroP > valorMetro) {
                valorMetro = valorMetroP;
                nome = p.getNome();
            }
        }

        return "O material com mais caro por metro cúbido é: " + nome + " com: R$ " + valorMetro
                + " por metro cúbido.";
    }

    public static String verificarDensidade(List<Produtos> produtos) {
        String nome = "";
        double densidade = 0;

        for (Produtos p : produtos) {
            double densidadeProduto = p.getVolume() / p.getPeso();

            if (densidadeProduto > densidade) {
                densidade = densidadeProduto;
                nome = p.getNome();
            }
        }

        return "O material mais denso é: " + nome + " com: " + densidade;
    }

    public static String verificarMaiorProduto(List<Produtos> produtos) {
        String nome = "";
        double volume = 0;
        for (Produtos p : produtos) {
            if (p.getVolume() > volume) {
                volume = p.getVolume();
                nome = p.getNome();
            }
        }

        return "O maior produto é: " + nome;
    }
}
