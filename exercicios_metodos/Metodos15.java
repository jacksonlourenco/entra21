package exercicios_metodos;

import java.util.Scanner;

/*
Faça um programa que diz se um número inserido está dentro de um limite imposto pelo usuário
Por exemplo:
Usuário inseriu o limite máximo como 100.
Usuário inseriu o limite mínimo como 70.
Depois ele inseriu o número 80.
O retorno deve ser: 80 está nos limites impostos
*/
public class Metodos15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor máximo: ");
        int numMax = sc.nextInt();
        System.out.print("Insira o valor mínimo: ");
        int numMin = sc.nextInt();
        System.out.print("Insira um numero: ");
        int num = sc.nextInt();

        System.out.println(limitador(numMax, numMin, num));
    }

    private static Object limitador(int numMax, int numMin, int num) {

        if (num <= numMax && num >= numMin) {
            return num + " está dentro do limite";
        } else {
            return num + " está fora dos limites";
        }

    }
}
