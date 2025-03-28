import java.util.Scanner;

public class Exerc17 {
	
	/**
	 * Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as três cartas 
	*deste usuário em uma mão de jogo de truco (1= AS; 2=2; 3=3; 7=7;11=Valete; 12= Dama; 13= Rei).
	*O algoritmo deve imprimir na tela a palavra “TRUCO” (se APENAS UMA das três cartas for AS, 2  ou 3), 
	*“SEIS” (se APENAS DUAS das três cartas for AS, 2 ou 3) ou “NOVE” (se AS TRÊS cartas forem AS, 2 ou 3).
	*Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada.
	 **/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a 1º carta");
		int cart1 = sc.nextInt();
		System.out.println("Insira a 2º carta");
		int cart2 = sc.nextInt();
		System.out.println("Insira a 3º carta");
		int cart3 = sc.nextInt();
		
		
		if ((cart1 <= 0 || cart1 > 13) || (cart2 <= 0 || cart2 > 13) || (cart3 <= 0 || cart3 > 13)) {
			System.out.println("A carta inserida não é válida.");
			
		} else if (cart1 <= 3 && cart2 <= 3 && cart3 <= 3) {
			System.out.println("NOOOOOVEEEEEE!");
			
		} else if ((cart1 <= 3 && cart2 <= 3) || (cart1 <= 3 && cart3 <= 3) || (cart2 <= 3 && cart3 <= 3)) {
			System.out.println("SEEEEEIS!");
			
		} else if (cart1 <= 3 || cart2 <= 3 || cart3 <= 3) {
			System.out.println("TRUCOOO!");
			
		}
		
		else {
			System.out.println("Você não possui cartas boas.");
			
		}
	}
}
