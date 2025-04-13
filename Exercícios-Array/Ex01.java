import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade[] = new int[5];
		String nome[] = new String[5];
		
		
		for(int i = 0; i < idade.length; i++) {
			System.out.print("Digite o nome do familiar: ");
			nome[i] = sc.next();
			System.out.print("Digite a idade: ");
			idade[i] = sc.nextInt();
			
			
			System.out.println("O familiar: " + nome[i] + " possui " + idade[i] + " anos.");
			System.out.println("");
		}
	}
}
