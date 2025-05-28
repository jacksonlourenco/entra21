package exercicios_heranca.Exercicio02;

public class Gatos extends Animais {
    String cor;
    String manchas;

    public Gatos(String cor, String manchas, String habitat, String nome, String origem, String porte, String raca) {
        super(habitat, nome, origem, porte, raca);
        this.cor = cor;
        this.manchas = manchas;
    }

}
