import java.util.Arrays;

public class Mat04 {
	public static void main(String[] args) {
		int matriz1[][] = {{1,2}, {1,2}};
		int matriz2[][] = {{9, 44}, {55, 155}};
		int calculo[][] = new int[2][2];
		
		for(int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				calculo[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		System.out.println(Arrays.deepToString(calculo));
	}
}
