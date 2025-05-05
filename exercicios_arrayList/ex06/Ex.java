package exercicios_arrayList.ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("[1] Adicionar nome");
        System.out.println("[2] Exibir nomes");
        System.out.println("[0] Encerrar");
        System.out.print("Selecione uma opção: ");
        int option = sc.nextInt();

        while (option != 0) {
            String nome;

            switch (option) {
                case 1:
                    System.out.print("Insira um nome: ");
                    nome = sc.next();
                    adicionarNome(nomes, nome);
                    break;
                case 2:
                    mostrarNomes(nomes);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.print("\nEscolha uma opção: ");
            option = sc.nextInt();
        }

        System.out.print("Insira o nome: ");
        String nome = sc.next();

    }

    // Remover todos os nomes duplicados.
    public static void adicionarNome(List<String> nomes, String nome) {
        boolean existe = false;

        for (String n : nomes) {
            if (n.equalsIgnoreCase(nome)) {
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("O nome já existe. Não é possível adicionar");
        } else {
            nomes.add(nome);
        }

    }

    // Exibir a lista sem nomes duplicados.
    public static void mostrarNomes(List<String> nomes) {
        if (nomes.isEmpty()) {
            System.out.println("Nenhum nome na lista.");
        } else {
            System.out.println("Nomes:");
            for (String n : nomes) {
                System.out.println("- " + n);
            }
        }
    }
}
