import java.util.Scanner;

public class Exerci08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inscricao, quantidadeAtleta = 0;
        double altura, somaAltura = 0;
        double atletaAlto = Double.MIN_VALUE;
        double atletaBaixo = Double.MAX_VALUE;
        int inscricaoAlto = 0, inscricaoBaixo = 0;

        while (true) {
            System.out.print("Insira a inscrição do atleta (ou um número negativo para sair): ");
            inscricao = sc.nextInt();

            if (inscricao <= 0) {
                System.out.println("Encerrando cadastro de atletas...");
                break;
            }

            System.out.print("Insira a altura do atleta: ");
            altura = sc.nextDouble();

            quantidadeAtleta++;
            somaAltura += altura;

            if (altura > atletaAlto) {
                atletaAlto = altura;
                inscricaoAlto = inscricao;
            }

            if (altura < atletaBaixo) {
                atletaBaixo = altura;
                inscricaoBaixo = inscricao;
            }
        }

        if (quantidadeAtleta > 0) {
            double mediaAtleta = somaAltura / quantidadeAtleta;

            System.out.printf("\nO atleta mais alto tem inscrição %d e altura %.2f m.\n", inscricaoAlto, atletaAlto);
            System.out.printf("O atleta mais baixo tem inscrição %d e altura %.2f m.\n", inscricaoBaixo, atletaBaixo);
            System.out.printf("A média de altura entre os atletas é: %.2f m.\n", mediaAtleta);
        } else {
            System.out.println("\nNenhum atleta cadastrado.");
        }

        sc.close();
    }
}
