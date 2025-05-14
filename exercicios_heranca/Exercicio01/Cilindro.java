package exercicios_heranca.Exercicio01;

public class Cilindro extends Circulo {
    double altura;

    public double calcularVolume() {
        double volume = Math.pow(raio, 2) * altura;
        return volume;
    }
}
