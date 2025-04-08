package Vetores;


public class Ex02_1 {
	public static void main(String[] args) {
		double matriz[][] = new double[12][2];
		int mes[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		double lucro[] = new double[12]; 
		
		for(int i = 0; i < lucro.length; i++) {
			lucro[i] = 1000 + (Math.random() * 9000);
		}
	
		for(int i = 0; i < matriz.length; i++) {
			matriz[i][0] = mes[i];
			matriz[i][1] = lucro[i];
		}
		
		System.out.println("Mês\tLucro (R$)");
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%.0f\tR$ %.2f%n", matriz[i][0], matriz[i][1]);
        }
	}
}
