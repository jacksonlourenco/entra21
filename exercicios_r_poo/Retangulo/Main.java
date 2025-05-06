package exercicios_r_poo.Retangulo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Retangulo> retangulos = new ArrayList<>();

        retangulos.add(new Retangulo(2, 42));
        retangulos.add(new Retangulo(6, 29));
        retangulos.add(new Retangulo(15, 20));
        retangulos.add(new Retangulo(8, 10));
        retangulos.add(new Retangulo(1, 5));

        System.out.println(retangulos);

        double maiorArea = Double.MIN_VALUE;
        double maiorPerimetro = Double.MIN_VALUE;

        for (Retangulo retangulo : retangulos) {
            double area = Calcular.calcularArea(retangulo);
            double perimetro = Calcular.calcularPerimetro(retangulo);

            if (area > maiorArea) {
                maiorArea = area;

            }

            if (perimetro > maiorPerimetro) {
                maiorPerimetro = perimetro;
            }
        }

        System.out.println("O retangulo com maior área tem: " + maiorArea);
        System.out.println("O retangulo com maior perímetro tem: " + maiorPerimetro);
    }
}
