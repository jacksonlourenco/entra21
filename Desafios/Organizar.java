public class Organizar {
    public static void main(String[] args) {
        int vetor[] = { 6, 0, 1, 2, 1, 2, 3, 4, 5, 1, 6 };

        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i + 1] == vetor[i] + 1) {
                System.out.print(vetor[i]);

                while (i < vetor.length - 1 && vetor[i + 1] == vetor[i] + 1) {
                    i++;
                    System.out.print(", " + vetor[i]);
                }

                System.out.println();
                break;
            }
        }
    }
}
