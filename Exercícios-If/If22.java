import java.util.Scanner;

public class If22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo para ler as 
		 *idades dos filhos e exibir quem é o mais velho, o irmão do meio e o caçula da família. 
		 *Suponha que não haja empates.
		 */
		System.out.print("Insira a idade do marquinhos: ");
		int marquinhos = sc.nextInt();
		System.out.print("Insira a idade do zezinho: ");
		int zezinho = sc.nextInt();
		System.out.print("Insira a idade da luluzinha: ");
		int luluzinha = sc.nextInt();
		
		int irmaoVelho = Math.max(marquinhos, Math.max(zezinho, luluzinha));
		int irmaoNovo = Math.min(marquinhos, Math.min(zezinho, luluzinha));
		int irmaoMeio = marquinhos + zezinho + luluzinha - irmaoNovo - irmaoVelho;
		
		if (marquinhos != zezinho && marquinhos != luluzinha && zezinho != luluzinha) {
            if (irmaoVelho == marquinhos) {
                System.out.println("\nO mais velho é: Marquinhos com " + marquinhos + " anos.");
            } else if (irmaoVelho == zezinho) {
                System.out.println("\nO mais velho é: Zezinho com " + zezinho + " anos.");
            } else {
                System.out.println("\nO mais velho é: Luluzinha com " + luluzinha + " anos.");
            }

            if (irmaoMeio == marquinhos) {
                System.out.println("O do meio é: Marquinhos com " + marquinhos + " anos.");
            } else if (irmaoMeio == zezinho) {
                System.out.println("O do meio é: Zezinho com " + zezinho + " anos.");
            } else {
                System.out.println("O do meio é: Luluzinha com " + luluzinha + " anos.");
            }

            if (irmaoNovo == marquinhos) {
                System.out.println("O mais novo é: Marquinhos com " + marquinhos + " anos.");
            } else if (irmaoNovo == zezinho) {
                System.out.println("O mais novo é: Zezinho com " + zezinho + " anos.");
            } else {
                System.out.println("O mais novo é: Luluzinha com " + luluzinha + " anos.");
            }

        } else {
            System.out.println("\nAs idades precisam ser diferentes!");
        }
	}
}
