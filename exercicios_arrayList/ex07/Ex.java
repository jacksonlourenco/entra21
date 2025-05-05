package exercicios_arrayList.ex07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Faça um algoritmo que verifica palíndromos 
public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma palavra: ");
        String palavra = sc.nextLine();

        ArrayList<Character> original = new ArrayList<>();
        for (char c : palavra.toLowerCase().toCharArray()) {
            original.add(c);
        }

        ArrayList<Character> palavraInvertida = new ArrayList<>(original);
        Collections.reverse(palavraInvertida);

        if (original.equals(palavraInvertida)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

    }
}
