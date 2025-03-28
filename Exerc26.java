import java.util.Scanner;

public class Exerc26 {
	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu 
		 *salário. A empresa irá conceder 5% de reajuste para o funcionário que for admitido há menos 
		 *de 12 meses. Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. O 
		 *seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o salário do funcionário: R$ ");
		double salario = sc.nextDouble();
		System.out.println("Insira o tempo de empresa do funcionário: ");
		int tempoEmpresa = sc.nextInt();
		
		if (tempoEmpresa <= 12) {
			salario = salario * 1.05;
			System.out.println("O novo salário do funcionário será de: R$ " + salario);
		} else if (tempoEmpresa <= 48) {
			salario = salario * 1.07;
			System.out.println("O novo salário do funcionário será de: R$ " + salario);
		}
	}
}
