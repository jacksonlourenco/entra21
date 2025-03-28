import java.util.Scanner;

public class Exerc24 {
	public static void main(String[] args) {
		/*
		 * Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, descreva 
		 *um algoritmo que calcule a média de aproveitamento e o conceito do aluno.
		 *Usando a fórmula: média de aproveitamento = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a 1º nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("Insira a 2º nota: ");
		double nota2 = sc.nextDouble();
		System.out.print("Insira a 3º nota: ");
		double nota3 = sc.nextDouble();
		System.out.print("Insira a nota dos exercícios: ");
		double notaE = sc.nextDouble();
		
		double media = (nota1 + nota2 * 2 + nota3 * 3 + notaE) / 7;
		double aprovado = 7.5;
		
		System.out.println(media);
		if (media >= 9.0) {
			System.out.println("\nA nota do aluno foi A.");
		} else if (media >= 7.5) {
			System.out.println("\nA nota do aluno foi B.");
		} else if (media >= 6.0) {
			System.out.println("\nA nota do aluno foi C.");
		} else if (media >= 4.0) {
			System.out.println("\nA nota do aluno foi D.");
		} else if (media < 4 && media >= 0) {
			System.out.println("\nA nota do aluno foi E.");
		} else {
			System.out.println("\nA nota inserida não é válida.");
		}
		
		if (media >= aprovado) {
			System.out.println("O aluno foi Aprovado!");
		} else {
			System.out.println("O aluno foi Reprovado!");

		}
	}
}
