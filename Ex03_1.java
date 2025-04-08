package Vetores;

public class Ex03_1 {
	public static void main(String[] args) {
		
		int matriz[][] = {{4, 12}, {2, -3}};
		
        int determinante = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);

        System.out.println("O determinante da matriz é: " + determinante);
	}
}
