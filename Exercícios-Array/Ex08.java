import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double num[] = new double[10];
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("Insira o número: ");
			num[i] = sc.nextInt();
			
			if(i % 2 == 0) {
				num[i] *= 1.02;
			} else {
				num[i] *= 1.05;
			}
			
		System.out.println("["+i+"] = " + df.format(num[i]));
		System.out.println("");
		}
	}
}
