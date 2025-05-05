package exercicios_arrayList.ex03_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> decimais = new ArrayList<>();

        System.out.println("Insira 0 para encerrar a aplicação!");
        System.out.print("Insira um número decimal: ");
        int num = sc.nextInt();

        /*
         * 3) O usuário vai colocando valores decimais até ele colocar o número 0.
         */
        while (num != 0) {
            decimais.add(num);

            System.out.print("Insira um número para adicionar à lista de números decimais: ");
            num = sc.nextInt();
        }

        System.out.println("\n==========ENCERRANDO==========\n");

        /*
         * 4) Faça um algoritmo que descubra se uma Array List possui o número que o
         * usuário entrou.
         * 
         * Imprima também o seu índice
         */
        System.out.print("Verficiar array: ");
        int verificar = sc.nextInt();
        if (decimais.contains(verificar)) {
            System.out.println("Possui o número: " + verificar + " e está no index: " + decimais.indexOf(verificar));
        }

        int menorNum = Integer.MAX_VALUE;
        int maiorNum = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 0; i < decimais.size(); i++) {
            if (decimais.get(i) < menorNum) {
                menorNum = decimais.get(i);
            }

            if (decimais.get(i) > maiorNum) {
                maiorNum = decimais.get(i);
            }

            soma += decimais.get(i);
        }
        System.out.println("A) Qual o menor número? " + menorNum);
        System.out.println("B) Qual o maior número? " + maiorNum);

        double media = soma / decimais.size();
        System.out.println("C) Calcular a média " + media);

    }
}
