package exercicios_poo.Circulo;

public class Main {
    public static void main(String[] args) {
        Circulo[] circulos = new Circulo[5];
        circulos[0] = new Circulo(3);
        circulos[1] = new Circulo(6);
        circulos[2] = new Circulo(9);
        circulos[3] = new Circulo(12);
        circulos[4] = new Circulo(15);


        System.out.println("A área do Circulo é: " + circulos[0].calcularArea());
        System.out.println("A área do Circulo é: " + circulos[1].calcularArea());
        System.out.println("A área do Circulo é: " + circulos[2].calcularArea());
        System.out.println("A área do Circulo é: " + circulos[3].calcularArea());
        System.out.println("A área do Circulo é: " + circulos[4].calcularArea());

    }

}
