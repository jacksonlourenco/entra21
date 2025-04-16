package exercicios_metodos;

import java.util.Scanner;

/*
Faça um programa que receba 2 números do usuário.
Faça um método que descubra qual dos números é maior e retorne esse valor.
Se os dois números forem iguais, retorne: número iguais
*/
public class Metodos11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o 1 numero: ");
        int num1 = sc.nextInt();
        System.out.print("Insira o 2 numero: ");
        int num2 = sc.nextInt();

        System.out.println("O maior número é: " + maiorNum(num1, num2));
    }

    private static Object maiorNum(int num1, int num2) {
        String text = "os número são iguais.";

        if (num1 > num2) {
            return num1;
        } else if (num2 > num1) {
            return num2;
        } else {
            return text;
        }
    }
}
