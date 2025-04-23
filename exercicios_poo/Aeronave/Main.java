package exercicios_poo.Aeronave;

public class Main {
    public static void main(String[] args) {

        Aeronave[] aeronaves = new Aeronave[3];
        aeronaves[0] = new Aeronave();
        aeronaves[1] = new Aeronave();
        aeronaves[2] = new Aeronave();

        aeronaves[0].nome = "Foguete";
        aeronaves[0].passageiros = 40;
        aeronaves[0].velMax = 145;
        aeronaves[0].capComb = 200;
        aeronaves[0].queimaCombMin = 15;

        aeronaves[1].nome = "Jato";
        aeronaves[1].passageiros = 20;
        aeronaves[1].velMax = 220;
        aeronaves[1].capComb = 200;
        aeronaves[1].queimaCombMin = 8;

        aeronaves[2].nome = "Avião";
        aeronaves[2].passageiros = 90;
        aeronaves[2].velMax = 105;
        aeronaves[2].capComb = 300;
        aeronaves[2].queimaCombMin = 10;

        System.out.println(
                "A) Qual aeronave leva o maior número de passageiros? " + VerificarAeronave.maiorNumPass(aeronaves));

        System.out.println(
                "B) Qual das aeronaves pode ficar no ar por mais tempo? " + VerificarAeronave.duracaoVoo(aeronaves));

        System.out.println(
                "C) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe? "
                        + VerificarAeronave.maiorTempoVoo(aeronaves));
    }
}
