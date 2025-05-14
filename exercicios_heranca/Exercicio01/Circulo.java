package exercicios_heranca.Exercicio01;

public class Circulo {
    String cor;
    double raio;

    public double calcularAra() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}
