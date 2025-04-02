import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cliente[] = new int[30];
		int sexo;
		int nota, idade;
		int homem = 0;
		int mulheres = 0;
		int idosas = 0;
		double mediaCinema = 0;
		double mediaHomens = 0;
		double notaMulherNova = Double.MAX_VALUE;

		System.out.println("Avaliando o cinema!");
		for (int i = 0; i < cliente.length; i++) {

			System.out.println("\n[1] Feminino\n[2] Masculino");
			System.out.print("Insira sua resposta: ");
			sexo = sc.nextInt();

			if (sexo == 2) {
				homem++;

				System.out.print("Insira sua idade: ");
				idade = sc.nextInt();

				if (idade >= 0) {
					System.out.print("Insira a nota para o cinema (0 a 10): ");
					nota = sc.nextInt();

					if (nota >= 0 && nota <= 10) {
						mediaCinema += nota;
						mediaHomens += nota;
					}

				} else {
					System.out.println("Favor inserir uma idade válida!");
					i--;
				}

			} else if (sexo == 1) {
				System.out.print("Insira sua idade: ");
				idade = sc.nextInt();

				if (idade >= 0) {
					System.out.print("Insira a nota para o cinema (0 a 10): ");
					nota = sc.nextInt();
					
					if (nota >= 0 && nota <= 10) {
						mediaCinema += nota;
						if(idade >= 50 && nota >= mediaCinema) {
							idosas++;
						}
						if(idade <= notaMulherNova) {
							notaMulherNova = nota;
						}
					}

				} else {
					System.out.println("Favor inserir uma idade válida!");
					i--;
				}

			} else {
				System.out.println("Opção incorreto!");
				i--;
			}
		}
		double mediaCine = mediaCinema / cliente.length;
		double mediaH = mediaHomens / homem;
		System.out.println("\nA media do cinema é: " + mediaCine);
		System.out.println("A media dos homens é: " + mediaH);
		System.out.println("A nota da mulher mais jovem é: " + notaMulherNova);
		System.out.println(idosas + " mulheres acima de 50 anos deram nota acima da média do cinema.");

	}
}
