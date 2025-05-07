package exercicios_r_poo.Municipio;

import java.util.List;

public class Desempenho {
    public void calcularDesempenho(List<Vereadores> vereadores) {

        for (Vereadores v : vereadores) {
            double ind = 0;

            double desempenho = (v.apProjeto / v.qntProjeto);

        }
    }
}
