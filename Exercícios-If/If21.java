import java.util.Scanner;

public class If21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre 
		 *homens e mulheres sempre serão diferentes).
		 *Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o 
		 *produto das idades do homem mais novo com a mulher mais velha.

		 */
		System.out.print("Insira a idade do 1º Homem: ");
		int idadeH1 = sc.nextInt();
		System.out.print("Insira a idade do 2º Homem: ");
		int idadeH2 = sc.nextInt();
		System.out.print("Insira a idade da 1º Mulher: ");
		int idadeM1 = sc.nextInt();
		System.out.print("Insira a idade da 1º Mulher: ");
		int idadeM2 = sc.nextInt();
		
		int hVelho = Math.max(idadeH1, idadeH2);
		int hNovo = Math.min(idadeH1, idadeH2);
		int mVelho = Math.max(idadeM1, idadeM2);
		int mNovo = Math.min(idadeM1, idadeM2);
		
		if(idadeH1 != idadeH2 && idadeM1 != idadeM2) {
			System.out.println("A soma das idades do Homem mais velho e Mulher mais nova é: "+ (hVelho + mNovo));;
			System.out.println("\nO produto da idade do Homem mais novo com a mulher mais velha é: " + (hNovo * mVelho));
		} else {
			System.out.println("As idades precisam ser diferentes!");
		}
	}
}
