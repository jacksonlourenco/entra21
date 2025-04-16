package exercicios_metodos;

import java.util.Scanner;

/*
Faça um método que receba um número, esse será o número "base"
Dentro do método, faça o usuário entrar com mais dois números
Imprima qual dos dois últimos números está mais perto do primeiro número "base"
*/
public class Metodos06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("insira a base: ");
        int base = sc.nextInt();

        numBase();
        compararDistancias(base);
    }

    public static void numBase() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número base: ");
        int numBase = sc.nextInt();

        System.out.print("Insira o 1º número: ");
        int num1 = sc.nextInt();
        System.out.print("Insira o 2º número: ");
        int num2 = sc.nextInt();

        if (num1 != numBase && num2 != numBase) {
            int maisProximo = (Math.abs(num1 - numBase) < Math.abs(num2 - numBase)) ? num1 : num2;
            System.out.println("O número mais próximo de " + numBase + " é: " + maisProximo);
        } else if (num1 == numBase) {
            System.out.println("O número 1 é igual o número base: " + num1);
        } else if (num2 == numBase) {
            System.out.println("O número 2 é igual o número base: " + num2);
        }
    }

    public static void compararDistancias(int base) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o número 1: ");
        int num1 = sc.nextInt();
        System.out.print("Insira o número 2: ");
        int num2 = sc.nextInt();

        int distancia1 = Math.abs(base - num1);
        int distancia2 = Math.abs(base - num2);

        if (distancia1 < distancia2) {
            System.out.println("O número: " + num1 + " está mais próximo da base " + base);
        } else if (distancia2 < distancia1) {
            System.out.println("O número: " + num2 + " está mais próximo da base " + base);
        } else {
            System.out.println("Distância iguais.");
        }
    }

}
