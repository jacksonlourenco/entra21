import java.util.Scanner;

public class Exerci10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char sex;
		int mulheres = 0, homens = 0;
		double altura, mediaAlturaF=0, mediaAlturaM = 0;
		int option;
		
		while (true) {
			System.out.println("Escolha:\n"
					+ "[0]Para sair.\n"
					+ "[1]Para continuar");
			option = sc.nextInt();
			
			if(option == 0) {
				System.out.println("Encerrando código...");
				break;
			} else if (option == 1) {
				System.out.println("Qual o sexo do usuário?\n"
						+ "[F] Para Feminino.\n"
						+ "[M] Para Masculino.");
				sex = sc.next().charAt(0);
				
				if(sex == 'f' || sex == 'F') {
					System.out.print("Insira a altura da mulher: ");
					altura = sc.nextDouble();
					
					mediaAlturaF += altura;
					mulheres++;

				} else if (sex == 'm' || sex == 'M') {
					System.out.print("Insira a altura da homem: ");
					altura = sc.nextDouble();
					
					mediaAlturaM += altura;
					homens++;
				} else {
					System.out.println("O sexo inserido não é válido!");
				}
			} else {
				System.out.println("Opção inválida!");
			}
		}
		
		if(mulheres > 0) {
			double mediaF = mediaAlturaF / mulheres;
			System.out.println("A media da altura feminina é de: " + mediaF);
		}
		if(homens > 0) {
			double mediaM = mediaAlturaM / homens;
			System.out.println("A media da altura masculina é de: " + mediaM);
		}
		
	}
}
