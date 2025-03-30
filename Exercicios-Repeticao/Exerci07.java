import java.util.Scanner;

public class Exerci07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double altura, somaAltura = 0;
		String pessoa;
		int quantidadePessoa = 0;

		while (true) {
			System.out.print("Insira o nome da pessoa: ");
			pessoa = sc.next();
			System.out.print("Insira altura da pessoa: ");
			altura = sc.nextDouble();
			
			if(altura <= 0) {
				System.out.println("Altura inserida não é válida");
				break;
			} else {
				somaAltura += altura;
				quantidadePessoa++;
			}
		}
		if (quantidadePessoa > 0) {
			double mediaAltura = somaAltura / quantidadePessoa;
			System.out.println("A media de altura é de: " + mediaAltura + "m.");
		} else {
			System.out.println("Sem alturas inseridas!");
		}
	}
}
