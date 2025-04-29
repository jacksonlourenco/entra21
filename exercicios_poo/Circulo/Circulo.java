package exercicios_poo.Circulo;

public class Circulo { 
    double raio;

    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
 
    public Circulo(double raio) { 
        this.raio = raio;

    }
}
