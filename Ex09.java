import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tam = 5, num;
		int vetor[] = new int[tam]; 
		int maior = Integer.MIN_VALUE;
		
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.println("Insira o valor: ");
			num = sc.nextInt();
			vetor[i] = num;
			
			if(num > maior) {
				maior = num;
			}
		}
		
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.print(vetor[i] + ", ");
		}
		System.out.println("\nO maior número inserido é: " + maior);
	}
}
