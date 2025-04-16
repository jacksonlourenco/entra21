package exercicios_metodos;

import java.util.Scanner;

/*
Faça um método booleano que retorne true se o número passado como parâmetro seja par.
Retorne false caso seja ímpar.
*/
public class Metodos10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = sc.nextInt();

        System.out.println(ePar(num));
    }

    private static boolean ePar(int num) {
        return num % 2 == 0;
    }
}
