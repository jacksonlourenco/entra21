package exercicios_poo.Onibus;

public class Main {
    public static void main(String[] args) {
        OnibusEscolar bus = new OnibusEscolar();
        bus.setQntEstudante(35);
        bus.setQntProfessores(5);

        bus.adicionarEstudante(40);

        System.out.println("Alunos: " + bus.getQntEstudante() + " \nProfessores: " + bus.getQntProfessores());
    }
}
