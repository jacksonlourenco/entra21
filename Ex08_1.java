package Vetores;

public class Ex08_1 {
	public static void main(String[] args) {
		
		int matriz[][] = {
				{1, 3, 5, 7, 9},
				{3, 6, 9, 12, 15},
				{6, 12, 18, 24, 36}
		};
		int numRep = 0;
		int qntdPares = 0;
		int numImpares = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				int valorAtual = matriz[i][j];
				
				for(int k = 0; k < matriz.length; k++) {
					for (int l = 0; l < matriz[k].length; l++) {
						if((i != k || j != l) && matriz[k][l] == valorAtual) {
							System.out.println("Elemento repetido: " + valorAtual + " [" + i + "][" + j + "] e [" + k + "][" + l + "]");
						}
					}
				}
				
				if(matriz[i][j] % 2 == 0) {
					qntdPares++;
				} else if ((matriz[i][j] % 2 != 0) && matriz[i][j] > matriz.length) {
					numImpares++;
				}
				
			}
		
		}
		
		System.out.println("\nQuantidade de números pares: " + qntdPares);
		System.out.println("\nNúmeros ímpares maiores do que a matriz: " + numImpares);
		
	}
}
