package exercicios_r_poo.Material_Construcao;

import java.util.List;
import java.util.Scanner;

public class GerenciarProduto {
    Scanner sc = new Scanner(System.in);

    public void venderProduto(List<Produtos> produtos) {
        System.out.print("O que quer comprar? ");
        String nome = sc.next();
        sc.nextLine();

        Produtos produto = null;

        for (Produtos p : produtos) {

            if (p.getNome().equalsIgnoreCase(nome)) {
                produto = p;
                break;
            }
        }

        if (produto != null) {
            System.out.print("Quantos deseja comprar? ");
            int quantidade = sc.nextInt();

            if (produto.getQuantidade() >= quantidade) {

                produto.setQuantidade(produto.getQuantidade() - quantidade);
                System.out.println("Compra realiza com sucesso. Total: R$ " + (produto.getPreco() * quantidade));
            } else {
                System.out.println("Quantidade insuficinte.");
            }

        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void adicionarEstoque(List<Produtos> produtos) {
        System.out.print("Insira o nome do produto: ");
        String nome = sc.next();
        sc.nextLine();

        Produtos produto = null;
        for (Produtos p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                produto = p;
                break;
            }
        }

        if (produto != null) {
            System.out.print("Insira a quantidade que irá ao estoque: ");
            int quantidade = sc.nextInt();

            produto.setQuantidade(produto.getQuantidade() + quantidade);
        } else {
            System.out.println("Produto não encontrado, adicionar novo produto!");
            System.out.print("Descrição: ");
            String descricao = sc.next();
            sc.nextLine();
            System.out.print("Peso: ");
            double peso = sc.nextDouble();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            System.out.print("Volume: ");
            double volume = sc.nextDouble();

            Produtos produtoNovo = new Produtos(descricao, nome, peso, preco, quantidade, volume);
            produtos.add(produtoNovo);
        }
    }

    public void aplicarDesconto(List<Produtos> produtos) {
        System.out.print("Quanto de desconto deseja aplicar? ");
        double desconto = sc.nextDouble();
        double porcentagem = desconto / 100;
        System.out.println("porcentagem" + porcentagem);

        System.out.print("Insira o produto que deseja aplicar o desconto: ");
        String nome = sc.next();
        sc.nextLine();

        Produtos produto = null;
        for (Produtos p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                produto = p;
                break;
            }
        }

        if (produto != null) {
            System.out.println(porcentagem);
            double valorDesconto = produto.getPreco() * porcentagem;
            System.out.println(valorDesconto);
            produto.setPreco(produto.getPreco() - valorDesconto);
            System.out.println("Preço atual: R$ " + produto.getPreco());

        } else {
            System.out.println("Produto não encontrado.");
        }

    }
}
