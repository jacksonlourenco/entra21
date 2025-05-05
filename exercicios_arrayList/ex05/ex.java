package exercicios_arrayList.ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        // Crie uma lista de tarefas
        Scanner sc = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();

        int option;
        boolean rodando = true;

        while (rodando) {
            String tarefa = "";

            System.out.println("[0] Encerrar");
            System.out.println("[1] Adicionar tarefa");
            System.out.println("[2] Remover tarefa");
            System.out.println("[3] Mostrar tarefas");
            System.out.print("Selecione uma opção: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Insira uma tarefa: ");
                    tarefa = sc.nextLine();
                    adicionarTarefa(tarefas, tarefa);
                    break;
                case 2:
                    System.out.print("Insira uma tarefa: ");
                    tarefa = sc.nextLine();
                    removerTarefa(tarefas, tarefa);
                    break;
                case 3:
                    mostrarTarefas(tarefas);
                    break;
                case 0:
                    rodando = false;
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }

        }

        System.out.println("Encerrando...");
    }

    public static void adicionarTarefa(List<String> tarefas, String tarefa) {
        boolean existe = false;

        for (String t : tarefas) {
            if (t.equalsIgnoreCase(tarefa)) {
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("Tarefa já existe na lista.");
        } else {
            tarefas.add(tarefa);
        }
    }

    public static void removerTarefa(List<String> tarefas, String tarefa) {
        boolean removido = false;

        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).equalsIgnoreCase(tarefa)) {
                tarefas.remove(i);
                removido = true;
                System.out.println("Removido com sucesso!");
                break;
            }
        }

        if (!removido) {
            System.out.println("Tarefa não encontrada");
        }
    }

    public static void mostrarTarefas(List<String> tarefas) {

        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            System.out.println("Tarefas: ");
            for (String t : tarefas) {
                System.out.println("- " + t);
            }
        }
    }

}
