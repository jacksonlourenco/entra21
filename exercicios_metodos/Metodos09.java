package exercicios_metodos;

import java.util.Scanner;

/*
Faça um método que receba 4 números como parâmetros, some os 4 números.
Retorne a soma.
*/
public class Metodos09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o 1 número: ");
        int num1 = sc.nextInt();
        System.out.print("Insira o 2 número: ");
        int num2 = sc.nextInt();
        System.out.print("Insira o 3 número: ");
        int num3 = sc.nextInt();
        System.out.print("Insira o 4 número: ");
        int num4 = sc.nextInt();

        System.out.println(somarNum(num1, num2, num3, num4));
    }

    private static int somarNum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}
