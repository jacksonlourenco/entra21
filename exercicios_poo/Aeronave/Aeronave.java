package exercicios_poo.Aeronave;

public class Aeronave {
    String nome;
    int passageiros;
    int velMax;
    double capComb;
    double queimaCombMin;

    public double calcularTempVoo() {
        return capComb / queimaCombMin;
    }

    public double calcularDistMax() {
        double tempoVoo = capComb / queimaCombMin;
        double distMax = velMax * (tempoVoo / 60);

        return distMax;
    }
}
