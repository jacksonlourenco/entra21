import java.util.Scanner;

public class Exerci02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Insira um número: ");
			int num = sc.nextInt();
			
			if (num % 2 == 0) {
				System.out.println("O número é par: " + num);
			} else {
				System.out.println("O número é ímpar: " + num);
			}
		}
	}
}
