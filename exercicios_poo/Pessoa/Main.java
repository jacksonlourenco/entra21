package exercicios_poo.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa ana = new Pessoa();
        ana.nome = "ana";
        ana.dtn = "20/08/2000";
        ana.estadoCivil = "solteira";
        ana.sexo = 'F';

        System.out.println(ana.nome.substring(0, 1).toUpperCase() + ana.nome.substring(1).toLowerCase() +
                " nasceu em " + ana.dtn + " é do sexo " + ana.sexo + " e atualmente está " + ana.estadoCivil);

        Pessoa jose = new Pessoa();
        jose.nome = "Jose";
        jose.dtn = "10/04/1975";
        jose.estadoCivil = "casado";
        jose.sexo = 'M';

        System.out.println("\n" + jose.nome.substring(0, 1).toUpperCase() + jose.nome.substring(1).toLowerCase() +
                " nasceu em " + jose.dtn + " é do sexo " + jose.sexo + " e atualmente está " + jose.estadoCivil);
    }
}
