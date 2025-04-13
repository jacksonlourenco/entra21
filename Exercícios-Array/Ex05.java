
public class Ex05 {
	public static void main(String[] args) {
		
		int num[] = new int[99];
		int quadrado = 0;
		int index = -1;
		
		for(int i = 0; i <= num.length; i++) {
			quadrado = i;
			index = i;
			System.out.println("[" + index + "]" + " = " + (quadrado*i));
		}
		
	}
}
