import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String questions[] = { "Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?",
				"Gosta de redes sociais?", "Gosta da Oktoberfest?" };
		int points = 0;
		String request;
		String man[] = new String[5];
		String woman[] = new String[5];

		System.out.println("Respostas do Homem!\n");
		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);

			System.out.println("[SIM]\n" + "[NAO]\n" + "[IND]");
			System.out.print("Insira sua resposta: ");
			request = sc.next();
			System.out.println("");

			if (request.equalsIgnoreCase("SIM")) {
				man[i] = request;
			} else if (request.equalsIgnoreCase("NAO")) {
				man[i] = request;
			} else if (request.equalsIgnoreCase("IND")) {
				man[i] = request;
			} else {
				System.out.println("Valor inserido está incorreto, encerrando...");
				break;
			}
		}

		System.out.println("Respostas da Mulher!\n");
		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);

			System.out.println("[SIM]\n" + "[NAO]\n" + "[IND]");
			System.out.print("Insira sua resposta: ");
			request = sc.next();
			System.out.println("");

			if (request.equalsIgnoreCase("SIM")) {
				woman[i] = request;
			} else if (request.equalsIgnoreCase("NAO")) {
				woman[i] = request;
			} else if (request.equalsIgnoreCase("IND")) {
				woman[i] = request;
			} else {
				System.out.println("Valor inserido está incorreto, encerrando...");
				break;
			}
		}

		for (int j = 0; j < man.length; j++) {
			
			if(man[j].equalsIgnoreCase(woman[j])) {
				points += 3;
			} else if((man[j].equalsIgnoreCase("SIM") && woman[j].equalsIgnoreCase("NAO")) 
					|| (man[j].equalsIgnoreCase("NAO") && woman[j].equalsIgnoreCase("SIM"))) {
				points -= 2;
			} else {
				points++;
			}
		}
		
		if(points == 15) {
			System.out.println("Caseeem!!!!");
		} else if(points >= 10 && points <= 14) {
			System.out.println("Vocês têm muita coisa em comum!");
		} else if(points >= 5 && points <= 9) {
			System.out.println("Talvez não dê certo :(");
		} else if (points >= 0 && points <= 4) {
			System.out.println("Vale um encontro.");
		} else if (points >= -1 && points <= -9) {
			System.out.println("Melhor não perder tempo!");
		} else if(points == -10) {
			System.out.println("Vocês se odeiam!! kkkk");
		}

	}
}
