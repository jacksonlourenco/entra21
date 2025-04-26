package exercicios_metodos;

public class Metodos16 {
    public static void main(String[] args) {
        int vetor[] = { 1, 5, 6, 20, 2, 15 };
        int vetor2[] = {4, 10, 224, 33};

        System.out.println("O menor elemento é: " + menorElemento(vetor2));
        System.out.println("O maior elemento é: " + maiorElemento(vetor2));
        System.out.println("A media dos elementos é: " + mediaElementos(vetor2));
    }

    private static double mediaElementos(int[] vetor) {

        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double mediaElementos = soma / vetor.length;
        return mediaElementos;
    }

    private static int maiorElemento(int[] vetor) {
        int maiorElemento = Integer.MIN_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorElemento) {
                maiorElemento = vetor[i];
            }
        }

        return maiorElemento;
    }

    private static int menorElemento(int[] vetor) {
        int menorElemento = Integer.MAX_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorElemento) {
                menorElemento = vetor[i];
            }
        }

        return menorElemento;

    }
}
