package exercicios_poo.Empregado;

public class Empregado {
    String identify;
    String nome;
    String sobrenome;
    double salario;

    public Empregado(String identify, String nome, String sobrenome, double salario) {
        this.identify = identify;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public double salarioAnual() {
        double salarioAnual = salario * 12;

        return salarioAnual;
    }

    public String nomeCompleto() {
        return nome + " " + sobrenome;
    }

    public void aumentoSalario(double aumento) {
        this.salario = salario * aumento;
    }

    // Outra maneira de alterar o salário, separando em algumas variável e alterando
    // a lógica
    public void modificarSalario(double percentual) {
        double aumento = salario * (percentual / 100);
        double novoSalario = salario + aumento;
        this.salario = novoSalario;
    }
}
