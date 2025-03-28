import java.util.Scanner;

public class Exerc16 {
	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que 
		 *indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS.
		 *Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos 
		 *demais, e apenas irmãos se todas as idades forem diferentes.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Em que ano o 1º irmão nasceu?");
		int irm1 = sc.nextInt();
		System.out.println("Em que ano o 2º irmão nasceu?");
		int irm2 = sc.nextInt();
		System.out.println("Em que ano o 3º irmão nasceu?");
		int irm3 = sc.nextInt();
		
		if (irm1 == irm2 && irm1 == irm2 && irm2 == irm3) {
			System.out.println("Os irmãos são TRIGÊMEOS");
		} else if (irm1 == irm2 || irm1 == irm3 || irm2 == irm3) {
			System.out.println("Os irmãos são GÊMEOS");
		} else {
			System.out.println("Eles são apenas IRMÃOS");
		}
	}
}
