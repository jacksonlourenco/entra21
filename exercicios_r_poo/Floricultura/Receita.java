package exercicios_r_poo.Floricultura;

import java.util.List;

public class Receita {

    public static String verificarFlorCara(List<Floricultura> floricultura) {

        String nomeFlor = "";
        double florCara = 0;

        for (Floricultura flor : floricultura) {

            if (flor.getPreco() > florCara) {
                florCara = flor.getPreco();
                nomeFlor = flor.getFlor();
            }
        }

        return "A flor mais cara é: " + nomeFlor + " com o valor de R$: " + florCara;
    }

    public static String maiorReceita(List<Floricultura> floricultura) {

        double receitaPresente = 0;
        double receitaSemPresente = 0;

        for (Floricultura flor : floricultura) {

            if (flor.isPresente()) {
                receitaPresente += flor.getPreco();
            } else {
                receitaPresente += flor.getPreco();
            }
        }

        if (receitaPresente > receitaSemPresente) {
            return "A maior receita da loja foi vendendo para presente, com um valor de: R$ " + receitaPresente;
        } else {
            return "A maior receita foi sem presente, com um total de: R$ " + receitaSemPresente;
        }
    }
}
