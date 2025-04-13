import java.util.Scanner;

public class Rep06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] alturas = new double[5];
		double soma = 0;
		
		for(int i = 0; i < alturas.length; i++) {
			System.out.print("Digite a altura da pessoa " + (i+1) + ": ");
			alturas[i] = sc.nextDouble();
			soma += alturas[i];
		}
		double media = soma / alturas.length;
		System.out.println("A media de altura é: " + media);
	}
}
