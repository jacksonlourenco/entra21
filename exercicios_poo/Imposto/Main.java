package exercicios_poo.Imposto;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[5];
        pessoas[0] = new Pessoa();
        pessoas[1] = new Pessoa();
        pessoas[2] = new Pessoa();
        pessoas[3] = new Pessoa();
        pessoas[4] = new Pessoa();

        pessoas[0].nome = "João";
        pessoas[0].setCpf("123.456.789-00");
        pessoas[0].setUf("SC");
        pessoas[0].rendaAnual = 33000;

        pessoas[1].nome = "Jackson";
        pessoas[1].setCpf("123.456.789-00");
        pessoas[1].setUf("SC");
        pessoas[1].rendaAnual = 20000;

        pessoas[2].nome = "Caio";
        pessoas[2].setCpf("123.456.789-00");
        pessoas[2].setUf("SC");
        pessoas[2].rendaAnual = 8000;

        pessoas[3].nome = "Daniela";
        pessoas[3].setCpf("123.456.789-00");
        pessoas[3].setUf("SC");
        pessoas[3].rendaAnual = 12000;

        pessoas[4].nome = "Rodrigo";
        pessoas[4].setCpf("123.456.789-00");
        pessoas[4].setUf("SC");
        pessoas[4].rendaAnual = 18500;

        System.out.println("A) Quem mais paga imposto? " + Imposto.maiorImposto(pessoas));
        System.out.println("B) Quem menos paga imposto? " + Imposto.menorImposto(pessoas));
        System.out
                .println("C) Qual o total de imposto pago entre os 5 contribuintes? " + Imposto.totalImposto(pessoas));
    }
}
