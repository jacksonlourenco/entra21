import java.util.Scanner;

public class Exerc19 {
	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo em que o usuário entra com um número.
		 *Depois ele escolhe a operação que vai ser feita com esse número
		 *Caso ele escolha a operação 1
		 *Modifique a variável do número entrado e some 10 ao número original
		 *Caso ele escolha a operação 2
		 *Modifique a variável do número entrado e subtraia 10 do número original
		 *Caso ele escolha a operação 3
		 *Modifique a variável do número entrado e multiplique 10 ao número original
		 *Caso ele escolha a operação 4
		 *Modifique a variável do número entrado e divida 10 do número original
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int num = sc.nextInt();
		
		System.out.println("\nEscolha uma opção:\n"
				+ "\n1-Soma" + "\n2-Substração" + "\n3-Multiplique" + "\n4-Divisão");
		int option = sc.nextInt();
		
		if(option == 1) {
			System.out.println("\nO resultado é: " + (num + 10));
		} else if (option == 2) {
			System.out.println("\nO resultado é: " + (num - 10));

		} else if (option == 3) {
			System.out.println("\nO resultado é: " + (num * 10));

		} else if (option == 4) {
			System.out.println("\nO resultado é: " + (num / 10));

		} else {
			System.out.println("\nOpção inválida!");
		}
		
		// variável += || -= || *= || /=
	}
}
