package exercicios_poo.Mercado2;

public class VerificarReceita {

    // A) Quem teve a maior receita vendendo maçãs?
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

    // B) Quem teve a maior receita vendendo laranjas?
    public static String maiorReceitaLaranja(Mercado[] mercados) {
        double maiorVenda = 0;
        String nomeMercado = "";

        for (int i = 0; i < mercados.length; i++) {
            double receita = mercados[i].calcularLaranjas();

            if (receita > maiorVenda) {
                maiorVenda = receita;
                nomeMercado = mercados[i].nome;
            }
        }

        return nomeMercado;
    }

    // C) Qual das lojas teve a maior receita?
    public static String maiorReceitaLojas(Mercado[] mercados) {
        double maiorReceita = 0;
        String nomeMercado = "";

        for (int i = 0; i < mercados.length; i++) {
            double receita = mercados[i].calcularReceita();

            if (receita > maiorReceita) {
                maiorReceita = receita;
                nomeMercado = mercados[i].nome;
            }
        }

        return nomeMercado;
    }

    // D) Qual das lojas teve a menor receita?"
    public static String menorReceitaLojas(Mercado[] mercados) {
        double menorReceita = Double.MAX_VALUE;
        String nomeMercado = "";

        for (int i = 0; i < mercados.length; i++) {
            double receita = mercados[i].calcularReceita();

            if (receita < menorReceita) {
                menorReceita = receita;
                nomeMercado = mercados[i].nome;
            }
        }

        return nomeMercado;
    }

    // E) Qual das lojas ficou no \"meio\" em termos de receita?
    public static String meioReceitaLojas(Mercado[] mercados) {

        double[] receitas = new double[mercados.length];
        String[] nomes = new String[mercados.length];

        for (int i = 0; i < mercados.length; i++) {
            receitas[i] = mercados[i].calcularReceita();
            nomes[i] = mercados[i].nome;
        }

        for (int i = 0; i < receitas.length - 1; i++) {
            for (int j = 0; j < receitas.length - i - 1; j++) {

                if (receitas[j] > receitas[j + 1]) {

                    double tempReceita = receitas[j];
                    receitas[j] = receitas[j + 1];
                    receitas[j + 1] = tempReceita;

                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;
                }
            }
        }

        int meio = receitas.length / 2;

        return nomes[meio];
    }
}