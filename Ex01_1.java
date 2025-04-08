package Vetores;

import java.util.Arrays;

public class Ex01_1 {
	public static void main(String[] args) {
		int matriz[][] = new int[2][2];
		
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		
		matriz[1][0] = 2;
		matriz[1][1] = 4;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + ", ");
			}
		}
		

	}
}
