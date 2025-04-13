import java.util.Scanner;

public class Rep01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 20;
		
		for (int i = numero; i >= 10; i--) {
			System.out.println("Em for: " + i);
		}
		
		while (numero >= 10) {
			numero--;
			System.out.println("Em while: " + numero);
		}
		
	}
}
