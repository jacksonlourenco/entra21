package exercicios_r_poo.ContaBanco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Jota", -1000));
        contas.add(new Conta("Joao", 50000.50));
        contas.add(new Conta("Maria", 20000));

        CaixaEletronico caixa = new CaixaEletronico();
        // caixa.depositarDinheiro(contas);
        // caixa.sacarDinheiro(contas);
        caixa.transferirDinheiro(contas);

    }
}
