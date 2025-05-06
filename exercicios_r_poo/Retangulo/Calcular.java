package exercicios_r_poo.Retangulo;

public class Calcular {

    public static double calcularArea(Retangulo retangulo) {
        return retangulo.getAltura() * retangulo.getLargura();
    }

    public static double calcularPerimetro(Retangulo retangulo) {
        return 2 * (retangulo.getAltura() * retangulo.getLargura());
    }
}
