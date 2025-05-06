package exercicios_r_poo.Material_Construcao;

public class Produtos {

    private String nome;
    private String descricao;
    private double preco;
    private double volume;
    private double peso;
    private int quantidade;

    public Produtos(String descricao, String nome, double peso, double preco, int quantidade, double volume) {
        this.descricao = descricao;
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
        this.quantidade = quantidade;
        this.volume = volume;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
