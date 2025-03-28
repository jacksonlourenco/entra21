import java.util.Scanner;

public class Exerc14 {
	public static void main(String[] args) {
		/*
		 *Dada a idade de um nadador descreva um algoritmo que o classifique em uma das seguintes categorias:
		 *pré-mirim 5 - 7 anos
		 *mirim 8 - 10 anos
		 *infantil 11 - 13 anos
		 *infanto-juvenil 14 - 17 anos
		 *juvenil 18 - 20 anos
		 *adulto maiores de 21 anos
		 */
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("O nadador é pré-mirim");
			
		} else if(idade <= 10) {
			System.out.println("O nadador é mirim");
			
		} else if(idade <= 13) {
			System.out.println("O nadador é infatil");

		} else if (idade <= 17) {
			System.out.println("O nadador é infanto-juvenil");

		} else if (idade <= 20) {
			System.out.println("O nadador é juvenil");

		} else {
			System.out.println("O nadador é adulto");

		}
	}
}
