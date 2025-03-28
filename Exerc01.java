import java.util.Scanner;

public class Exerc01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o 1º número: ");
		int num1 = input.nextInt();
		
		System.out.println("Insira o 2º número: ");
		int num2 = input.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("\nO resultado da soma é: " + soma);
	}
}
