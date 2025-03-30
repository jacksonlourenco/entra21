import java.util.Scanner;

public class Exerci05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("Insira um número: ");
			int num = sc.nextInt();
			if (num <= 1000) {
				System.out.println("O número inserido foi: " + num);
			} else {
				System.out.println("\nO número inserido não é válido!");
				break;
			}
		}
	}
}
