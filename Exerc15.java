import java.util.Scanner;

public class Exerc15 {
	public static void main(String[] args) {
		/*
		 * Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está
		localizado no plano cartesiano
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a posição X");
		double x = sc.nextDouble();
		System.out.println("Insira a posição Y");
		double y = sc.nextDouble();

		if(x == 0 && y == 0) {
			System.out.println("Está no meio do plano");
			
		} else if(x > 0 && y > 0) {
			System.out.println("Está no quadrante Nordeste");

		} else if (x < 0 && y > 0) {
			System.out.println("Está no quadrante Noroeste");
			
		} else if (x < 0 && y < 0) {
			System.out.println("Está no quadrante Sudoeste");
			
		} else if (x >= 0 && y < 0) {
			System.out.println("Está no quadrante Sudeste");

		} else if (x == 0) {
			System.out.println("Está sobre o eixo Y");
		} else if (y == 0) {
			System.out.println("Está sobre o eixo X");
		}
		
	}
}
