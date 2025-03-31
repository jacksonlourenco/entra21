
public class Ex07 {
	public static void main(String[] args) {
		int vetor[] =  {58, 88, 99, 150, 337};
		int vetorInverso[] = new int[vetor.length];
		
		for (int i = vetor.length-1; i >= 0 ; i--) {
			vetorInverso[i] = vetor[vetor.length-1-i];
			
		}
		for(int i = 0; i < vetorInverso.length; i++) {
			System.out.print(vetorInverso[i] + ", ");
		}
		
	}
}
