import java.util.Scanner;

public class If08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de A:");
		double a = sc.nextDouble();
		
		System.out.println("Insira o valor de B:");
		double b = sc.nextDouble();
		
		System.out.println("Insira o valor de C:");
		double c = sc.nextDouble();
		
		double triangulo = (a * c) / 2;
		System.out.println("\nA área do Triangulo base A e C é: " + triangulo);
		
		double circulo = Math.PI * Math.pow(c, 2);
		System.out.println("\nA área do Círculo com o raio C é: " + circulo);
		
		double trapezio = ((a + b) * c) / 2;
		System.out.println("\nA área do trapézio é: " + trapezio);
		
		double quadrado = b*b;
		System.out.println("\nA área do quadrado com base B é: " + quadrado);
		
		double retangulo = a*b;
		System.out.println("\nA area do retangulo com lados A e B é: " + retangulo);
		
	}
}
