package exercicios_r_poo.Municipio;

public class Vereadores {
    String nome;
    String partido;
    int qntProjeto;
    int apProjeto; // projeto aprovado
    double desempenho;

    public Vereadores(String nome, String partido, int qntProjeto, int apProjeto) {
        this.nome = nome;
        this.partido = partido;
        this.qntProjeto = qntProjeto;
        this.apProjeto = apProjeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getQntProjeto() {
        return qntProjeto;
    }

    public void setQntProjeto(int qntProjeto) {
        this.qntProjeto = qntProjeto;
    }

    public int getApProjeto() {
        return apProjeto;
    }

    public void setApProjeto(int apProjeto) {
        this.apProjeto = apProjeto;
    }

    public double getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(double desempenho) {
        this.desempenho = desempenho;
    }

}
