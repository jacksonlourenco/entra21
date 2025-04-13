import java.util.Scanner;

public class If05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a nota da 1º avaliação:");
		double nota1 = input.nextDouble();
		
		System.out.println("Insira a nota da 2º avaliação:");
		double nota2 = input.nextDouble();
		
		double peso1 = 6.5;
		double peso2 = 3.5;
		
		double somaValores = (nota1 * peso1) + (nota2 * peso2);
		double somaPesos = peso1 + peso2;
		double mediaPonderada = somaValores / somaPesos;
		// double media = ((nota1 * peso1) + (nota2 * peso2)) / 10; Outra maneira de realizzar este cálculo.
		
		System.out.println("A média ponderada é: " + mediaPonderada);
		
		
	}
}
