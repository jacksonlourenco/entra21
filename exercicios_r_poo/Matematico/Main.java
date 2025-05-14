package exercicios_r_poo.Matematico;

public class Main {
    public static void main(String[] args) {
        InteiroPositivo n1 = new InteiroPositivo(5);

        System.out.println(n1.getNumX());
        System.out.print("A) ");
        n1.setValue(10);
        System.out.print("B) ");
        n1.multiplicarX(2);
        System.out.print("C) ");
        n1.calcularFatorial();
        System.out.print("D) Pode ser divisível por: ");
        n1.mostrarDivisores();
    }
}
