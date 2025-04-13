import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o raio do círculo: ");
		double raio = input.nextDouble();
		
		double area = 3.14*(raio*raio); //Sem lib.
		double area2 = Math.PI * Math.pow(raio, 2); 
		
		System.out.printf("A area do círculo é: %.2f", area2);
	}
}
