import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tam = 5;
		int num[] = new int[tam];
		
		while(true) {
			System.out.println("Insira o índice (0 a " + (tam-1) + ").");
			int ind = sc.nextInt();
			
			if(ind >= tam || ind < 0) {
				System.out.println("\nO índice inserido não é válido.");
				break;
			}
			
			System.out.println("\nInsira o número que irá armazenar.");
			int valor = sc.nextInt();
			
			num[ind] = valor;
			System.out.println("\nAtulizando array: ");
			for(int i = 0; i < num.length; i++) {
				System.out.println("Índice " + i + ": " + num[i]);
			}
		}
	}
}
