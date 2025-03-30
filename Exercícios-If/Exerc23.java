import java.util.Scanner;

public class Exerc23 {
	public static void main(String[] args) {
		/*
		 * O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma 
		 *pessoa está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo 
		 *quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula:
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a altura: ");
		double altura = sc.nextDouble();
		System.out.print("Insira o peso, apenas número: ");
		double peso = sc.nextDouble();
		
		double imc = (peso / Math.pow(altura, 2));
		
		if (imc < 16.0) {
            System.out.println("\nO seu IMC é de: " + imc + ", você está na classificação de Magreza Severa!");
        } else if (imc >= 16.0 && imc <= 16.9) {
            System.out.println("\nO seu IMC é de: " + imc + ", você está na classificação de Magreza Moderada!");
        } else if (imc >= 17.0 && imc <= 18.4) {
            System.out.println("\nO seu IMC é de: " + imc + ", você está na classificação de Magreza Leve!");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("\nO seu IMC é de: " + imc + ", você está na classificação de Saudável!");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("\nO seu IMC é de: " + imc + ", você está na classificação de Sobrepeso!");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("\nO seu IMC é de: " + imc + ", você está na classificação de Obesidade Grau I!");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("\nO seu IMC é de: " + imc + ", você está na classificação de Obesidade Grau II!");
        } else {
            System.out.println("\nO seu IMC é de: " + imc + ", você está na classificação de Obesidade Mórbida. Procure um médico!");
        }
		
	}
}
