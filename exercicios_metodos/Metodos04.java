package exercicios_metodos;

/*
 Faça um programa que descubra:
a) O maior elemento de um vetor
b) O menor elemento de um vetor
c) A média dos valores
(Criar um método para cada questão)
 */
public class Metodos04 {
    public static void main(String[] args) {
        int vetor[] = { 5, 15, 1, 14, 20 };

        maiorValor(vetor);
        menorValor(vetor);
        mediaValores(vetor);
    }

    public static void maiorValor(int num[]) {

        int maiorValor = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > maiorValor) {
                maiorValor = num[i];
            }
        }
        System.out.println("O maior valor é: " + maiorValor);
    }

    public static void menorValor(int num[]) {
        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < menorValor) {
                menorValor = num[i];
            }
        }
        System.out.println("O menor valor é: " + menorValor);
    }

    public static void mediaValores(int num[]) {
        int somaValores = 0;

        for (int i = 0; i < num.length; i++) {
            somaValores += num[i];
        }

        double mediaValores = somaValores / num.length;

        System.out.println("A media dos valores é: " + mediaValores);
    }
}
