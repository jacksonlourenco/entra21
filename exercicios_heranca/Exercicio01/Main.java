package exercicios_heranca.Exercicio01;

public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();

        Cilindro c2 = new Cilindro();
        c2.cor = "vermelho";
        c2.raio = 2.5;
        c2.altura = 4;
        System.out.println(c2.calcularAra());
        System.out.println(c2.calcularVolume());
    }
}
