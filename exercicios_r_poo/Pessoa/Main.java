package exercicios_r_poo.Pessoa;

public class Main {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua itapetininga", "casa", 41);
        Pessoa p1 = new Pessoa("Jackson", e1);

        System.out.println("a" + p1);
    }
}
