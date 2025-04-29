package exercicios_poo.Empregado;

public class Main {
    public static void main(String[] args) {
        Empregado emp = new Empregado("123", "Rdrigo", "Souza", 1000);

        System.out.println(emp.salarioAnual());

        System.out.println("Nome completo: "+ emp.nomeCompleto());
        System.out.println("O salário anual do: "+ emp.nome + " é de: R$ "
        + emp.salarioAnual());


        emp.aumentoSalario(1.1);
        System.out.println("Salário pós aumento 15%: " + emp.salario);

    }

}
