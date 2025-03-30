import java.util.Scanner;

public class Exerci12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva um número para transformar em fatorial: ");
		int num = sc.nextInt();
		
		if (num < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } else {
            long fatorial = 1;
            
            for (int i = 1; i <= num; i++) {
                fatorial *= i; 
            }
            
            System.out.println("O fatorial de " + num + " é: " + fatorial);
        }
	}
}
