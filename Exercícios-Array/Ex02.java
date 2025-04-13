public class Ex02 {
	public static void main(String[] args) {

		int num[] = {5, 4, 3, 2, 1};
		
		/*
		for(int i = 0; i < num.length; i++) {
			int element = num.length - i;
			System.out.println(element);
		}
		*/
		
		for(int j = num.length - 1; j >= 0; j--) {
			System.out.println(num[j]);
		}
	}
}
