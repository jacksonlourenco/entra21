package exercicios_r_poo.Floricultura;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Floricultura> floricultra = new ArrayList<>();
        floricultra.add(new Floricultura("Jackson", "Rosa", 12.5, true));
        floricultra.add(new Floricultura("Jackson", "Rosa", 12.5, false));
        floricultra.add(new Floricultura("Jackson", "Girassol", 5.5, true));
        floricultra.add(new Floricultura("Jackson", "Girassol", 5.5, false));
        floricultra.add(new Floricultura("Jackson", "Tulipa", 8.5, true));

        System.out.println(Receita.verificarFlorCara(floricultra));
        System.out.println(Receita.maiorReceita(floricultra));

    }
}
