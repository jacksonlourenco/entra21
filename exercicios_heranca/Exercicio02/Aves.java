package exercicios_heranca.Exercicio02;

public class Aves extends Animais {
    String corPenas;
    String alimentacao;

    public Aves(String alimentacao, String corPenas, String habitat, String nome, String origem, String porte,
            String raca) {
        super(habitat, nome, origem, porte, raca);
        this.alimentacao = alimentacao;
        this.corPenas = corPenas;
    }

}
