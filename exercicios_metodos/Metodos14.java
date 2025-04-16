package exercicios_metodos;

import java.util.Scanner;

/*
Faça um programa que receba 3 notas do usuário e informe a média aritmética dessas 
notas
Retorne a média 
*/
public class Metodos14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a 1 nota: ");
        int nota1 = sc.nextInt();
        System.out.print("Insira a 2 nota: ");
        int nota2 = sc.nextInt();
        System.out.print("Insira a 3 nota: ");
        int nota3 = sc.nextInt();

        System.out.println("A média é: " + media(nota1, nota2, nota3));
    }

    private static double media(int num1, int num2, int num3) {
        double media = (num1 + num2 + num3) / 3;
        return media;
    }
}
