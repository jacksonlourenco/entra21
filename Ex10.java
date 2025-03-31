
public class Ex10 {
	public static void main(String[] args) {
		int tam = 10;
		int vetor1[] = {1,2,3,4,5,6,7,8,9,10};
		int vetor2[] = {50,50,50,50,50,50,50,50,50,50};
		int vetor3[] = new int[tam];

		System.out.println("Vetor 1:");
		for(int i = 0; i < vetor1.length; i++) {
			System.out.println("["+i+"] Vetor 1 = " + vetor1[i]);
		}
		
		System.out.println("\nVetor 2:");
		for(int i = 0; i < vetor2.length; i++) {
			System.out.println("["+i+"] Vetor 2 = " + vetor2[i]);

		}

		System.out.println("\nVetor 3:");
		for(int i = 0; i < vetor3.length; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
			System.out.println("["+i+"] Vetor 2 = " + vetor3[i]);
		}
		
		
	}
}
