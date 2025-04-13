import java.util.Scanner;

public class If10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Dados dois valores inteiros, escreva um algoritmo que informe se o primeiro número
		 * é múltiplo do segundo.
		 */
		System.out.println("Insira o 1º número:");
		int num1 = sc.nextInt();
		System.out.println("Insira o 2º número:");
		int num2 = sc.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.println("O primeiro número é múltiplo pelo segundo.");
		} else {
			System.out.println("O primeiro número não é múltiplo do segundo");
		}
	}
}
