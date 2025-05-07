package exercicios_r_poo.Material_Construcao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produtos> produtos = new ArrayList<>();
        produtos.add(new Produtos("Chave de fenda", "Chave de fenda", 5, 15.5, 10, 2));
        produtos.add(new Produtos("Martelo", "Martelo", 15, 30.5, 4, 10));

        System.out.println(VerificarInfo.verificarMaterialCaro(produtos));
        System.out.println(VerificarInfo.verificarMaterialPorMetro(produtos));
        System.out.println(VerificarInfo.verificarDensidade(produtos));
        System.out.println(VerificarInfo.verificarMaiorProduto(produtos));

        GerenciarProduto gerenciamento = new GerenciarProduto();

        gerenciamento.aplicarDesconto(produtos);
    }
}
