import java.util.Scanner;

public class Exerc03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor de A");
		int a = input.nextInt();
		
		System.out.println("Insira o valor de B");
		int b = input.nextInt();

		System.out.println("Insira o valor de C");
		int c = input.nextInt();

		System.out.println("Insira o valor de D");
		int d = input.nextInt();
		

		int diferenca = (a*b) - (c*d);
		
		System.out.println("\nO resultado da diferença entre os números é: " + diferenca);

	}
}
