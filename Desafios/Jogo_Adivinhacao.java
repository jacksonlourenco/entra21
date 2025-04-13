import java.util.Scanner;

/*
Implemente um jogo onde o usuário precisa adivinhar um número aleatório:

Ofereça 3 níveis: fácil (1-10), médio (1-50), difícil (1-100)

Informe se o palpite está acima ou abaixo

Limite de tentativas por nível
*/
public class Jogo_Adivinhacao {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int option, num;
		String text = "===========\n" + "[1] Fácil\n" + "[2] Médio\n" + "[3] Difícil\n" + "[0] Sair\n" + "===========\n";
		boolean acertou = false;
		int win = 0;
		int defeat = 0;
		int points = 0;
		
		System.out.print(text + "Selecione uma opção: ");
		option = sc.nextInt();

		while ((option != 0) && (option <= 3) && (option >= 1)) {
			int easy = (int) (Math.random() * 10) + 1;
			int medium = (int) (Math.random() * 50) + 1;
			int hard = (int) (Math.random() * 100) + 1;
			
			if (option == 1) {
				System.out.println("=====================" + "\nModo fácil escolhido!\n");

				for (int i = 0; i < 2; i++) {
					
					int maxTry = 2;
					
					System.out.print("\nInsira um número [1 a 10]: ");
					num = sc.nextInt();

					if (num == easy) {
						System.out.println("Parabéeens! Você acertou.");
						win++;
						points++;
						acertou = true;
						break;
					} else if (num > easy) {
						System.out.println("Palpite está maior do que o número correto. Tente novamente! Você tem: " + (maxTry - (i+1)) + " tentativas.");
					} else if (num < easy) {
						System.out.println("Palpite está abaixo do que o número correto. Tente novamente! Você tem: " + (maxTry - (i+1)) + " tentativas.");
					}

				}
				
				if (!acertou) {
					System.out.println("Você perdeu! O número era: " + easy);
					defeat++;
				} 
				
			} else if (option == 2) {
				System.out.println("=====================" + "\nModo médio escolhido!\n");
				
				for(int i = 0; i < 4; i++) {
					
					int maxTry = 5;
					
					System.out.print("\nInsira um número [1 a 50]: ");
					num = sc.nextInt();
										
					if (num == medium) {
						System.out.println("Parabéeens! Você acertou.");
						win++;
						points+=3;
						acertou = true;
						break;
					} else if (num > medium) {
						System.out.println("Palpite está maior do que o número correto. Tente novamente! Você tem: " + (maxTry - (i+1)) + " tentativas.");
					} else if (num < medium) {
						System.out.println("Palpite está abaixo do que o número correto. Tente novamente! Você tem: " + (maxTry - (i+1)) + " tentativas.");
					}
				}
				
				if (!acertou) {
					System.out.println("Você perdeu! O número era: " + medium);
					defeat++;
				} 

			} else if (option == 3) {
				System.out.println("========================" + "\nModo difícil escolhido!\n");

				for(int i = 0; i < 6; i++) {
					
					int maxTry = 10;
					
					System.out.print("\nInsira um número [1 a 100]: ");
					num = sc.nextInt();
					
					if (num == hard) {
						System.out.println("Parabéeens! Você acertou.");
						win++;
						points+=5;
						acertou = true;
						break;
					} else if (num > hard) {
						System.out.println("Palpite está maior do que o número correto. Tente novamente! Você tem: " + (maxTry - (i+1)) + " tentativas.");
					} else if (num < hard) {
						System.out.println("Palpite está abaixo do que o número correto. Tente novamente! Você tem: " + (maxTry - (i+1)) + " tentativas.");
					}
				}
				
				if (!acertou) {
					System.out.println("Você perdeu! O número era: " + hard);
					defeat++;
				}
			}
		
			System.out.print("\n" + text + "Selecione uma opção: ");
			option = sc.nextInt();
			acertou = false;
		}
		
		if(win != 0 && defeat != 0) {
			System.out.println("Você teve " + win + " vitórias.\n"
					+ "Você teve " + defeat + " derrotas.");
			System.out.println("\nVocê fez " + points + " no total do jogo.");
		}
		
		if(option == 0) {
			System.out.println("\nEncerrando o jogo. Muito obrigado!!!");
		}
	}
}
