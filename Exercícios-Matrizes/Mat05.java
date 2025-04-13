public class Mat05 {
	public static void main(String[] args) {
		int[][] matriz = {
				 {2104, 3, 399900},
				 {1600, 3, 329900},
				 {2400, 3, 369000},
				 {1416, 2, 232000},
				 {3000, 4, 539900},
				 {1985, 4, 299900},
				 {1534, 3, 314900},
				 {1427, 3, 199000},
				 {1380, 3, 212000},
				 {1494, 3, 242500},
				 {1940, 4, 240000},
				 {2000, 3, 347000},
				 {1890, 3, 330000},
				 {4478, 5, 699900},
				 {1268, 3, 259900}
				 };
		int valorCasas = 0;
		int casaCara = Integer.MIN_VALUE;
		int menorCasa = Integer.MAX_VALUE;
		int maisQuartos = Integer.MIN_VALUE;
		int menosQuartos = Integer.MAX_VALUE;
		int tamanhoMenos = 0;
		int tamanhoMais = 0;
		int mediaTamCs = 0;
		int qntdCasaCara = 0;
		int valorMenorCasa = 0;
		int qntdQuartoCasaCara = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			
			//A = Media valor das casas 
			valorCasas += matriz[i][2];
			
			//B = Valor menor Casa
			if(matriz[i][0] < menorCasa) {
				menorCasa = matriz[i][0];
				valorMenorCasa = matriz[i][2];
			}
			
			//C = Quantidade de quartos na casa mais cara.
			if(matriz[i][2] > casaCara) {
				casaCara = matriz[i][2];
				qntdQuartoCasaCara = matriz[i][1];
			}
			
			//D = Diferença de tamanho entre as casas com + e - quartos.
			if(matriz[i][1] < menosQuartos) {
				menosQuartos = matriz[i][1];
				tamanhoMenos = matriz[i][0];
			}
			
			if(matriz[i][1] > maisQuartos) {
				maisQuartos = matriz[i][1];
				tamanhoMais = matriz[i][0];
			}
			
			//E = Media tamanho casas caras.
			if(matriz[i][2] > 300000) {
				qntdCasaCara++;
				mediaTamCs += matriz[i][0];
			}
			
		}
		
		int mediaValor = valorCasas / matriz.length;
		int diferencaTam = tamanhoMais - tamanhoMenos;
		int mediaTamCasaCara = mediaTamCs / qntdCasaCara;
		
		System.out.println("\n===== RELATÓRIO DAS CASAS =====\n");

		System.out.printf("A) Média dos preços das casas: R$ %,d%n", mediaValor);

		System.out.printf("B) A menor casa tem %d m² e custa: R$ %,d%n", menorCasa, valorMenorCasa);

		System.out.printf("C) A casa mais cara custa R$ %,d e possui %d quartos%n", casaCara, qntdQuartoCasaCara);

		System.out.printf("D) Diferença de tamanho entre a casa com mais (%d) e menos (%d) quartos: %d m²%n",
		        maisQuartos, menosQuartos, diferencaTam);

		System.out.printf("E) Média de tamanho das casas que custam mais de R$ 300.000: %.2f m²%n",
		        (double) mediaTamCs / qntdCasaCara);

		
	}
}
