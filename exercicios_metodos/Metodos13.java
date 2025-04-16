package exercicios_metodos;

import java.util.Scanner;

/*
Faça um método que calcule o perímetro e outro que calcule a área de um retângulo
passando a altura e largura como parâmetros
Retornar os valores calculados 
*/
public class Metodos13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a altura: ");
        double altura = sc.nextDouble();
        System.out.print("Insira a largura: ");
        double largura = sc.nextDouble();

        System.out.println("Perimetro: " + perimetro(largura, altura));
        System.out.println("Area: " + area(largura, altura));
    }

    private static double area(double largura, double altura) {
        double area = largura * altura;
        return area;
    }

    private static double perimetro(double largura, double altura) {
        double perimetro = 2 * (largura + altura);
        return perimetro;
    }

}
