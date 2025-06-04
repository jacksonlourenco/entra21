package exemplo_jdbc;

public class Funcionario {
    private int cdFuncionario;
    private String nome;
    private String email;
    private double salario;
    private int cdDepartamento;

    public Funcionario() {
    }

    public Funcionario(int cd_funcionario, String nome, String email, double salario, int cdDepartamento) {
        setCdFuncionario(cd_funcionario);
        setNome(nome);
        setEmail(email);
        setSalario(salario);
        setCdDepartamento(cdDepartamento);
    }

    public int getCdFuncionario() {
        return cdFuncionario;
    }

    public void setCdFuncionario(int cdFuncionario) {
        this.cdFuncionario = cdFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCdDepartamento() {
        return cdDepartamento;
    }

    public void setCdDepartamento(int cdDepartamento) {
        this.cdDepartamento = cdDepartamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcionario{");
        sb.append("cdFuncionario=").append(cdFuncionario);
        sb.append(", nome=").append(nome);
        sb.append(", email=").append(email);
        sb.append(", salario=").append(salario);
        sb.append(", cdDepartamento=").append(cdDepartamento);
        sb.append('}');
        return sb.toString();
    }
}
