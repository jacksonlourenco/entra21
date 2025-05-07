package exercicios_r_poo.ContaBanco;

import java.util.List;
import java.util.Scanner;

public class CaixaEletronico {
    Scanner sc = new Scanner(System.in);

    public void sacarDinheiro(List<Conta> contas) {
        System.out.print("Insira o nome da conta: ");
        String nome = sc.nextLine();

        Conta conta = null;
        for (Conta c : contas) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                conta = c;
                break;
            }
        }

        if (conta != null) {
            System.out.print("Insira o valor de saque: R$ ");
            double saque = sc.nextDouble();

            if (conta.getSaldo() >= saque) {
                conta.setSaldo(conta.getSaldo() - saque);
                System.out.println("Saque realizo com sucesso!");
                System.out.println("Saldo atual: R$ " + conta.getSaldo());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void depositarDinheiro(List<Conta> contas) {
        System.out.print("Insira o nome da conta: ");
        String nome = sc.next();

        Conta conta = null;
        for (Conta c : contas) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                conta = c;
                break;
            }
        }

        if (conta != null) {
            System.out.print("Insira o valor de depósito: R$ ");
            double valor = sc.nextDouble();

            conta.setSaldo(conta.getSaldo() + valor);
            System.out.println("Depósito de: R$ " + valor + " realizado com sucesso!");
            System.out.println(conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void transferirDinheiro(List<Conta> contas) {

        System.out.print("Insira o nome da sua conta: ");
        String nome = sc.next();

        Conta contaR = null;
        for (Conta c : contas) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                contaR = c;
                break;
            }
        }

        if (contaR != null) {
            System.out.print("Insira a conta destino: ");
            String nomeD = sc.next();

            Conta contaD = null;
            for (Conta c : contas) {
                if (c.getNome().equalsIgnoreCase(nomeD)) {
                    contaD = c;
                    break;
                }
            }

            if (contaD != null && !contaD.getNome().equalsIgnoreCase(contaR.getNome())) {
                System.out.print("Insira o valor de transferência: R$ ");
                double valor = sc.nextDouble();

                if (contaR.getSaldo() >= valor) {
                    contaR.setSaldo(contaR.getSaldo() - valor);
                    System.out.println("R: " + contaR.getSaldo());
                    contaD.setSaldo(contaD.getSaldo() + valor);
                    System.out.println("D: " + contaD.getSaldo());
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else {
                System.out.println("Destinatário não encontrado!");
            }
        } else {
            System.out.println("Conta não encontrada!");
        }
    }
}
