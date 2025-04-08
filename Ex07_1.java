package Vetores;

public class Ex07_1 {
	public static void main(String[] args) {

		String matriz[][] = { { "*", "*", "*", "*" }, { "*", "*", "*", "*" }, { "*", "*", "*", "*" },
				{ "*", "*", "*", "*" } };

		System.out.println("A)");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nB)");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				if (i == 0 || i == 3 || j == 0 || j == 3) {
					System.out.print(matriz[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nC)");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print(matriz[i][j] + " ");

			}
			System.out.println();
		}
	}
}
