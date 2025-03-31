import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int num[] = new int[5];
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("Insira o "+ (i+1) + "º número: ");
			num[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			
			if(num[i] > maior) {
				maior = num[i];
			}
			if (num[i] < menor) {
				menor = num[i];
			}
		}
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);

		
	}
}
