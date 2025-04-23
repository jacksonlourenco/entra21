package exercicios_poo.Imposto;

public class Imposto {

    public static double calcularImposto(double rendaAnual) {
        double taxaA = 1;
        double taxaB = 1.058;
        double taxaC = 1.15;
        double taxaD = 1.275;
        double taxaE = 1.3;

        if (rendaAnual <= 4000) {
            double valorImposto = rendaAnual * taxaA;
            return valorImposto - rendaAnual;

        } else if (rendaAnual >= 4001 && rendaAnual <= 9000) {
            double valorImposto = rendaAnual * taxaB;
            return valorImposto - rendaAnual;

        } else if (rendaAnual >= 9001 && rendaAnual <= 25000) {
            double valorImposto = rendaAnual * taxaC;
            return valorImposto - rendaAnual;

        } else if (rendaAnual >= 25001 && rendaAnual <= 35000) {
            double valorImposto = rendaAnual * taxaD;
            return valorImposto - rendaAnual;

        } else {
            double valorImposto = rendaAnual * taxaE;
            return valorImposto - rendaAnual;
        }
    }

    // A) Quem mais paga imposto?
    public static String maiorImposto(Pessoa[] pessoas) {
        String nome = "";
        double imposto = 0;

        for (int i = 0; i < pessoas.length; i++) {
            double calcularImposto = calcularImposto(pessoas[i].rendaAnual);

            if (imposto < calcularImposto) {
                imposto = calcularImposto;
                nome = pessoas[i].nome;
            }
        }

        return nome;
    }

    // B) Quem menos paga imposto?
    public static String menorImposto(Pessoa[] pessoas) {
        String nome = "";
        double imposto = Double.MAX_VALUE;

        for (int i = 0; i < pessoas.length; i++) {
            double calcularImposto = calcularImposto(pessoas[i].rendaAnual);

            if (imposto > calcularImposto) {
                imposto = calcularImposto;
                nome = pessoas[i].nome;
            }
        }

        return nome;
    }

    // C) Qual o total de imposto pago entre os 5 contribuintes?
    public static double totalImposto(Pessoa[] pessoas) {
        double imposto = 0;

        for (int i = 0; i < pessoas.length; i++) {
            double calcularImposto = calcularImposto(pessoas[i].rendaAnual);

            imposto += calcularImposto;
        }

        return imposto;
    }

}
