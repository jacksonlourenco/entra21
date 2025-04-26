package exercicios_metodos;

import java.util.Scanner;

/*
Faça um programa que calcule o quadrado de um número caso esse número seja par e
o dobro desse número caso esse número seja ímpar.
Retorne o resultado
 */
public class Metodos12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int num = sc.nextInt();

        System.out.println("O resultado é: " + resultadoNum(num));
    }

    private static int resultadoNum(int num) {

        if (num % 2 == 0) {
            return (int) Math.pow(num, 2);
        } else {
            return num * 2;
        }
    }
}
