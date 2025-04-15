package exercicios_metodos;

import java.util.Scanner;

public class Metodos03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número a ser incrementado: ");
        int num = sc.nextInt();

        incrementarNumber(num);
    }

    public static void incrementarNumber(int num) {

        for (int i = num; i <= num + 20; i++) {
            System.out.println(i);
        }
    }
}
