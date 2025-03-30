import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double taxaCambio = 5.00;
		
		System.out.println("Quantos Doláres você deseja converter para Reais?");
		double dolar = sc.nextDouble();
		
		double conversaoReal = dolar * taxaCambio;
		
		System.out.println("\nO valor a receber em reais é de R$ " + df.format(conversaoReal));
	}
}
