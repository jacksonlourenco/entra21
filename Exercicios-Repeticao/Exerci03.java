public class Exerci03 {
	public static void main(String[] args) {
		
		int somaPares = 0;
		int somaImpares = 0;
		
		for (int j = 1; j <= 100; j++) {
			if (j % 2 == 0) {
				somaPares += j;
			} else {
				somaImpares += j;
			}
		}
        System.out.println("Soma dos números pares2: " + somaPares);
        System.out.println("Soma dos números ímpares2: " + somaImpares);
	}
}
