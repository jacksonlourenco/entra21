package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//SEXO - NOTA - IDADE
		int cliente[][] = new int[30][3];
		int sexo, idade, nota;
		int notaCine = 0;
		int qntdH = 0;
		int qntdM = 0;
		int mulherJovem = Integer.MAX_VALUE;
		int notaMulherJovem = 0;
		int notaHomens = 0;
		
		String[] text = {
				"[1] Mulher\n[2] Homem\nSelecione sua opção: ",
				"Qual nota você da para o cinema [0 a 10]?", 
				"Qual a sua idade?"};
		
		for(int i = 0; i < cliente.length; i++) {
			
			System.out.print(text[0]);
			sexo = sc.nextInt();
		
			
			if(sexo == 1) {
				qntdM++;
				
				System.out.println(text[1]);
				nota = sc.nextInt();
				
				while(nota < 0 || nota > 10) {
					System.out.println("Resposta inválida. Tente novamente!\n");
					System.out.print(text[1]);
					nota = sc.nextInt();
					System.out.println("");
				}
				
				if(nota >= 0 && nota <= 10) {
					notaCine += nota;
					
					System.out.println(text[2]);
					idade = sc.nextInt();
					
					if(idade <= mulherJovem) {
						mulherJovem = idade;
						notaMulherJovem = nota;
					}
					
					cliente[i][0] = sexo;
					cliente[i][1] = nota;
					cliente[i][2] = idade;
				}
				
				
			} else if(sexo == 2) {
				qntdH++;
				
				System.out.println(text[1]);
				nota = sc.nextInt();
				
				while(nota < 0 || nota > 10) {
					System.out.println("Resposta inválida. Tente novamente!\n");
					System.out.print(text[1]);
					nota = sc.nextInt();
					System.out.println("");
				}
				
				if(nota >= 0 && nota <= 10) {
					notaCine += nota;
					notaHomens += nota;
					
					System.out.println(text[2]);
					idade = sc.nextInt();
					if(idade > 0) {
						cliente[i][0] = sexo;
						cliente[i][1] = nota;
						cliente[i][2] = idade;
					}
				}
			} else {
				System.out.println("Resposta inválida");
				i--;
			}
			
			System.out.println("=====================");

		}
		int mediaCine = notaCine / cliente.length;
		int mediaHomens = notaHomens / qntdH;
		int idosaAcimaMedia = 0;
		
		for (int i = 0; i < cliente.length; i++) {
			if(cliente[i][0] == 1 && cliente[i][2] >= 50 && cliente[i][1] > mediaCine) {
				idosaAcimaMedia++;
			}
		}
		
		System.out.println("Qual a nota média recebida pelo cinema? " + mediaCine);
		System.out.println("Qual a nota média atribuida pelos homens? " + mediaHomens);
		System.out.println("Qual a nota atribuída pela mulher mais jovem? " + notaMulherJovem);
		System.out.println("Quantas das mulheres com mais de 50 anos deram nota superior à "
				+ "média recebida pelo cinema? " + idosaAcimaMedia);
		
		System.out.println(Arrays.deepToString(cliente));
	}
}
