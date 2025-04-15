package exercicios_metodos;

import java.util.Scanner;

public class Metodos07 {
    public static void main(String[] args) {
        generateStarWarsName();
    }

    public static void generateStarWarsName() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o seu nome: ");
        String nome = sc.next();
        System.out.print("Insira o seu sobrenome: ");
        String sobrenome = sc.next();
        sobrenome = sobrenome.toLowerCase();

        System.out.print("Insira o sobrenome de SOLTEIRA da sua mãe: ");
        String sobrenomeMae = sc.next();
        System.out.print("Cidade onde você nasceu: ");
        String cidade = sc.next();
        cidade = cidade.toLowerCase();

        String novoNome1 = nome.substring(0, 3);
        String novoNome2 = sobrenome.substring(0, 2);
        String novoNome = novoNome1.substring(0, 1).toUpperCase() + novoNome1.substring(1).toLowerCase() + novoNome2;

        String novoSobrenome1 = sobrenomeMae.substring(0, 2);
        String novoSobrenome2 = cidade.substring(0, 3);
        String novoSobrenome = novoSobrenome1.substring(0, 1).toUpperCase() + novoSobrenome1.substring(1).toLowerCase()
                + novoSobrenome2;

        System.out.println("O seu nome em Star Wars é: " + novoNome + " " + novoSobrenome);
    }
}
