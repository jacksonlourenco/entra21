import java.util.Scanner;

public class Exerci09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2 = 0;
		String nome;
		
		while(true) {
			System.out.print("Insira o nome do aluno: (ou FIM para encerrar): ");
			nome = sc.next();
			
			if(nome.equalsIgnoreCase("fim")) {
				System.out.println("Encerrando...");
				break;
			} else {
				System.out.print("Insira a 1ª nota do aluno: ");
				nota1 = sc.nextDouble();
				
				if(nota1 >= 0 && nota1 <= 10) {
					System.out.print("Insira a 2ª nota do aluno: ");
					nota2 = sc.nextDouble();
					
					if (nota2 >= 0 && nota2 <= 10) {
						double media = (nota1 + nota2) / 2;
						System.out.println("A media do " + nome + " é de: " + media);
					}
				} else {
					System.out.println("A nota inserida é inválida.");
				}
			}
		}
	}
}
