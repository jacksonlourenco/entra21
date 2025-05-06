package exercicios_r_poo.Material_Construcao;

import java.util.List;
import java.util.Scanner;

public class GerenciarProduto {
    Scanner sc = new Scanner(System.in);

    public static void venderProduto(List<Produtos> produtos) {
        System.out.print("O que quer comprar? ");
        String nome = sc.next();
        sc.nextLine();

        for (Produtos p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Quantos deseja comprar? ");
                int quantidade = sc.nextInt();

                if (p.getQuantidade() < quantidade) {

                    p.setQuantidade(p.getQuantidade() - quantidade);
                    System.out.println("Compra realiza com sucesso. Total: R$ " + (p.getPreco() * quantidade));
                } else {
                    System.out.println("Quantidade insuficinte.");
                }
            } else {
                System.out.println("Produto não encontrado.");
            }
            break;
        }
    }

    public static void adicionarEstoque(List<Produtos> produtos) {
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

    public static void aplicarDesconto(List<Produtos> produtos, int desconto) {
        double porcentagem = desconto / 10;

        System.out.print("Insira o produto que deseja aplicar o desconto: ");
        String nome = sc.next();
        sc.nextLine();
        boolean existe = false;

        for (Produtos p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                existe = true;
                if (existe) {
                    System.out.print("Quanto de desconto deseja aplicar? ");
                    desconto = sc.nextInt();
                    double valorDesconto = p.getPreco() * porcentagem;
                    p.setPreco(p.getPreco() - valorDesconto);
                    System.out.println("Preço atual: R$ " + p.getPreco());
                    break;
                }
            }
        }
        if (!existe) {
            System.out.println("Produto não encontrado.");
        }

    }
}
