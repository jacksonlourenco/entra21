package exercicios_metodos;

import java.util.Scanner;

public class Metodos05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o 1º número: ");
        double num1 = sc.nextDouble();
        System.out.print("Insira o 2º número: ");
        double num2 = sc.nextDouble();

        calcularNum(num1, num2);
    }

    public static void calcularNum(double num1, double num2) {

        double soma = num1 + num2;

        if ((num1 == 5 || num2 == 5) || (num1 + num2 == 5) || (num1 - num2 == 5) || (num2 - num1 == 5)) {
            soma = Math.pow(soma, 3);
            System.out.println(soma);
        } else {
            soma = Math.pow(soma, 2);
            System.out.println(soma);
        }
    }
}
