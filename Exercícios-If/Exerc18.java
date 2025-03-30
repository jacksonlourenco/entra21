import java.util.Scanner;

public class Exerc18 {
	/*
	 *Faça uma calculadora.
	 *O usuário entra com dois números e depois com a operação desejada.
	 *Caso o número da operação seja 1: some os dois números.
	 *Caso seja 2: subtraia os dois números.
	 *Caso seja 3: multiplique os dois números.
	 *Caso seja 4: divida os dois números
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número:");
		double num1 = sc.nextDouble();
		System.out.println("Insira a operação desejada");
		char operacao = sc.next().charAt(0);
		System.out.println("Insira o segundo número:");
		double num2 = sc.nextDouble();
		
		if (operacao == '+') {
			System.out.println("O resultado da soma é: " + (num1 + num2));
		} else if (operacao == '*') {
			System.out.println("O resultado da multiplicação é: " + (num1 * num2));

		} else if (operacao == '-') {
			System.out.println("O resultado da subtração é: " + (num1 - num2));

		} else if (operacao == '/') {
			System.out.println("O resultado da divisão é: " + (num1 / num2));

		} else {
			System.out.println("A operação não é válida, utilize um dos seguintes operadores: '+, -, *, /'.");
		}
		
	}
}
