import java.util.Scanner;

public class If09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Dados dois números inteiros distintos descreva um algoritmo para 
		 * informar qual deles têm o maior valor
		 */
		System.out.println("Insira o primeiro número:");
		int num1 = sc.nextInt();
		System.out.println("Insira o segundo número:");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("Os dois números são iguais.");
		} else if(num1 > num2) {
			System.out.println("Número 1 é maior.");
		} else {
			System.out.println("Número 2 é maior.");
		}
	}
}
