import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira o nome do funcionário: ");
		String nome = input.next();
		
		System.out.println("Insira o salário fixo do funcionário: ");
		double salarioFixo = input.nextDouble();
		
		System.out.println("Insira o valor total de suas vendas no mês atual: ");
		int totalVendas = input.nextInt(); //Valor R$
		
		double comissao = totalVendas * 0.15;
		double salarioFinal = salarioFixo + comissao;
		
		System.out.printf("\nO funcionário " + nome + " receberá um salário de R$ %.2f neste mês.", salarioFinal);
	}
}
