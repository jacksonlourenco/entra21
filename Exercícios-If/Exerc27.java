import java.util.Scanner;

public class Exerc27 {
	public static void main(String[] args) {
		/*
		 * A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar 
		 *mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo 
		 *de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o valor por 
		 *hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso 
		 *tenham sido trabalhadas (considere que o mês possua 4 semanas exatas)
		 */
		Scanner sc = new Scanner(System.in);
		
		int horaSemanal = 40 * 4;
		double salarioHora = 15.0;
		double salario = 0.0;
		
		System.out.print("Insira a quantidade de horas trabalhadas: ");
		int horaTrabalhada = sc.nextInt();
		
		System.out.println(horaTrabalhada);
		
		if(horaTrabalhada <= horaSemanal) {
			
			salario = salarioHora * horaTrabalhada;
			System.out.println("\nO salário do funcionário foi de: R$ " + salario);
		} else {

			int horaExtra = horaTrabalhada - horaSemanal;
			System.out.println(horaExtra);
			double salarioExtra = horaExtra * (salarioHora * 1.5);
			System.out.println(salarioExtra);
			salario = (salarioHora * horaSemanal) + salarioExtra;
			
			System.out.println("\nO salário do funcionário foi de: R$ " + salario);
		}
	}
}
