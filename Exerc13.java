import java.util.Scanner;

public class Exerc13 {
	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que o usuário entre com um char.
		* Determine se esse char é uma consoante ou vogal.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira uma letra do alfabeto");
		char alfabeto = sc.next().charAt(0); 
		if (Character.isLetter(alfabeto)) {
            // Converter o caractere para maiúscula para facilitar a comparação
            alfabeto = Character.toUpperCase(alfabeto);
            
            // Verificar se a letra é uma vogal
            if (alfabeto == 'A' || alfabeto == 'E' || alfabeto == 'I' || 
                alfabeto == 'O' || alfabeto == 'U') {
                System.out.println("A letra " + alfabeto + " é uma vogal");
            } else {
                System.out.println("A letra " + alfabeto + " é uma consoante");
            }
        } else {
            System.out.println("Entrada inválida! Por favor, insira uma letra.");
        }
	}
}
