package exercicios_metodos;

import java.util.Scanner;

public class Metodos08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Verão\n[2] Inverno\n[3] Primavera\n[4] Outono\n");
        System.out.print("Insira sua opção: ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println(verao());
        } else if (num == 2) {
            System.out.println(inverno());
        } else if (num == 3) {
            System.out.println(primavera());
        } else if (num == 4) {
            System.out.println(outono());
        } else {
            System.out.println("Opção incorreta.");
        }
    }

    private static String primavera() {
        return "É primavera";
    }

    private static String outono() {
        return "É outono";
    }

    private static String inverno() {
        return "É inverno";
    }

    private static String verao() {
        return "É verão";
    }
}
