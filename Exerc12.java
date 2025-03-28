import java.util.Scanner;

public class Exerc12 {
	public static void main(String[] args) {
		
		/*
		 *Faça um algoritmo que leia um caractere.
		 *Caso seja digitada a letra 'M' escreva “Masculino”.
		 *Se for digitada a letra 'F' escreva “Feminino”.
		 *Se for informado 'I' escreva “Não Informado”.
		 *Qualquer outra letra digitada escreva “Entrada Incorreta”
		 */
		Scanner sc = new Scanner(System.in);
		
		char caracter = sc.next().charAt(0);
		
		if(caracter == 'M') {
			System.out.println("Masculino");
			
		} else if (caracter == 'F') {
			System.out.println("Feminino");
			
		} else if (caracter == 'I') {
			System.out.println("Não informado");
			
		} else {
			System.out.println("Entrada incorreta");
			
		}
	}
}
