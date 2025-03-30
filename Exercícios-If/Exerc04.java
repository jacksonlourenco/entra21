import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira o número de telefone do funcionário: ");
		String telefone = input.nextLine();
		String telefoneFormatado = String.format("(%s) %s-%s", 
                telefone.substring(0, 2),    // DDD (XX)
                telefone.substring(2, 7),    // Parte 1 do número (XXXXX)
                telefone.substring(7, 11));  // Parte 2 do número (XXXX)
		
		System.out.println("Insira o nome do funcionário: ");
		String nome = input.nextLine(); 
		
		System.out.println("Qual a carga horário deste funcionário? ");
		double cargaHorario = input.nextDouble();
		
		System.out.println("Quanto ele ganha por hora? ");
		double valorHora = input.nextDouble();
		
		double salario = cargaHorario * valorHora;
		
		System.out.printf("\nO número do funcionário é: %s\n", telefoneFormatado);
		System.out.println("O nome do funcionário é: " + nome);
		//System.out.println("O nome do funcionário é: " + df.format(salario)); - Com DecimalFormat
		System.out.printf("O salário do funcionário é: R$ %.2f", salario);
	}
}
