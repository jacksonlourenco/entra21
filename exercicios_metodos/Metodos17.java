package exercicios_metodos;

import java.util.Scanner;

/*
Faça um código que recebe uma palavra do usuário, se essa palavra tem tamanho par, 
retorne o primeiro caractere dessa palavra.
Caso ela tenha tamanho ímpar, retorne o segundo caractere dessa palavra.
*/
public class Metodos17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma palavra: ");
        String palavra = sc.next();

        System.out.println(verificarTamanho(palavra));
    }

    private static String verificarTamanho(String palavra) {

        if (palavra.length() % 2 == 0) {
            return palavra.substring(0, 1);
        } else {
            return palavra.substring(1, 2);
        }
    }

}
