package exercicios_poo.livraria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Livraria> livraria = new ArrayList<>();
        // livro1.setEmprestado(false);

        String menu = "==============MENU==============\n[1] Para adicionar um livro\n[2] Ver livros disponíveis\n[3] Para pegar um livro emprestado\n[0] Para encerrar o sistema.";

        System.out.println(menu);
        System.out.print("Insira sua opçao: ");
        int option = sc.nextInt();

        while (option != 0) {

            if (option == 1) {
                sc.nextLine();
                System.out.print("Insira o nome do livro: ");
                String nome = sc.nextLine();

                Livraria livro = new Livraria(nome, true);

                livraria.add(livro);
                System.out.println("Livro " + nome + " adicionado.");

            } else if (option == 2) {
                sc.nextLine();

                List<String> livrosDisponiveis = livraria.stream()
                        .filter(livro -> livro.isEmprestado()) // pega apenas os que NÃO estão emprestados
                        .map(Livraria::getTitle) // extrai apenas o título
                        .collect(Collectors.toList());

                System.out.println("Livros disponíveis: " + livrosDisponiveis);

            } else if (option == 3) {
                sc.nextLine();
                System.out.print("Insira o nome do livro: ");
                String nome = sc.nextLine();

                boolean encontrado = false;

                for (Livraria livro : livraria) {
                    if (livro.getTitle().equalsIgnoreCase(nome)) {
                        encontrado = true;
                        if (livro.isEmprestado()) {
                            livro.setEmprestado(false);
                            System.out.println("Você pegou o livro emprestado!");
                            break;
                        } else {
                            System.out.println("Livro indisponível no momento.");
                        }
                    }
                }

                if (!encontrado) {
                    System.out.println("Livro não encontrado na livraria.");
                }

            } else {
                System.out.print("Opção incorreta, selecione novamente: ");
                option = sc.nextInt();
            }

            System.out.println("\n" + menu);
            System.out.print("Insira sua opçao: ");
            option = sc.nextInt();
        }

        System.out.println("Sistema encerrado.");
    }
}
