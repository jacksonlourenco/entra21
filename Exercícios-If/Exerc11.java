import java.util.Scanner;

public class Exerc11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Faça um algoritmo que imprima "nome correto" caso o nome inserido seja o seu.
		 */
		System.out.println("Insira o seu nome:");
		String nome = sc.nextLine();
		
		nome = nome.toUpperCase().trim().replaceAll("\\s+", " ");
		
		//equalsIgnoreCase
		if(nome.equals("JACKSON A LOURENCO")) {
			System.out.println("O nome inserido está correto!");
		} else {
			System.out.println("Não foi inserido o nome correto.");
		}
	}
}
