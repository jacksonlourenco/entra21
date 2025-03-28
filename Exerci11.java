import java.util.Scanner;

public class Exerci11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String menorIdade = "", maiorIdade = "";

		while (true) {
			System.out.print("Insira o nome do aluno (ou digite 'sair' para finalizar): ");
			String nome = sc.next();

			if (nome.equalsIgnoreCase("sair")) {
				System.out.println("Encerrando...");
				break; 
			}
			
			System.out.print("Insira a idade do: " + nome + ": ");
			int idade = sc.nextInt();

			if (idade >= 14 && idade <= 18) {
				
				menorIdade += nome + ", "; 
				
			} else if (idade >= 18) {
				maiorIdade += nome + ", ";
			}
		}
		if (!menorIdade.isEmpty()) {
			menorIdade = menorIdade.substring(0, menorIdade.length() - 2);
        } else {
        	menorIdade = "Nenhum aluno";
        }

        if (!maiorIdade.isEmpty()) {
        	maiorIdade = maiorIdade.substring(0, maiorIdade.length() - 2);
        } else {
        	maiorIdade = "Nenhum aluno";
        }

        // Exibe os grupos formados
        System.out.println("\n--- Alunos por Grupo ---");
        System.out.println("Grupo A (Menores de idade): " + menorIdade);
        System.out.println("Grupo B (Maiores de idade): " + maiorIdade);
	}
}
