package exercicios_poo.Aeronave;

public class VerificarAeronave {

    // A) Qual aeronave leva o maior número de passageiros?
    public static String maiorNumPass(Aeronave[] aeronaves) {
        int passageiros = 0;
        String nome = "";

        for (int i = 0; i < aeronaves.length; i++) {

            if (passageiros < aeronaves[i].passageiros) {
                passageiros = aeronaves[i].passageiros;
                nome = aeronaves[i].nome;
            }
        }

        return nome;

    }

    // B) Qual das aeronaves pode ficar no ar por mais tempo?
    public static String maiorTempoVoo(Aeronave[] aeronaves) {
        double tempoVoo = 0;
        String nome = "";

        for (int i = 0; i < aeronaves.length; i++) {

            if (tempoVoo < aeronaves[i].calcularTempVoo()) {
                tempoVoo = aeronaves[i].calcularTempVoo();
                nome = aeronaves[i].nome;
            }
        }

        return nome;
    }

    // C) Considerando que os aviões estão em velocidade máxima, qual deles consegue
    // voar mais longe?
    public static String duracaoVoo(Aeronave[] aeronaves) {
        double tempoVoo = 0;
        String nome = "";

        for (int i = 0; i < aeronaves.length; i++) {

            if (tempoVoo < aeronaves[i].calcularDistMax()) {
                tempoVoo = aeronaves[i].calcularDistMax();
                nome = aeronaves[i].nome;
            }
        }

        return nome;
    }
}
