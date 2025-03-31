import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senhas[] = {999, 888, 333, 555, 222};
		System.out.println("Insira a senha:");
		int num = sc.nextInt();
		
		boolean autorizado = false;
		int index = 0;
		
		for(int i = 0; i < senhas.length; i++) {
			if(num == senhas[i]) {
				autorizado = true;
				index = i;
				break;
			}
		}
		
		if(autorizado) {
			System.out.println("\nAcesso autorizado! (Index: " + (index+1) + ").");
		} else {
			System.out.println("\nSem autorização!");
		}
		
	}
}
