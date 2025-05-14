package exercicios_r_poo.Municipio;

public class Vereadores {
    String nome;
    String partido;
    int qntProjeto;
    int apProjeto; // projeto aprovado

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
        if (partido.equalsIgnoreCase("A") || partido.equalsIgnoreCase("B") || partido.equalsIgnoreCase("C")) {
            this.partido = partido;
        }
    }

    public int getQntProjeto() {
        return qntProjeto;
    }

    public void setQntProjeto(int qntProjeto) {
        if (qntProjeto >= 0) {
            this.qntProjeto = qntProjeto;
        }
    }

    public int getApProjeto() {
        return apProjeto;
    }

    public void setApProjeto(int apProjeto) {

        if (getQntProjeto() <= 0) {
            this.apProjeto = 0;
        } else {
            this.apProjeto = apProjeto;
        }

    }

    public double calcularDesempenho() {
        double indice;

        if (qntProjeto <= 0)
            return 0;

        if (qntProjeto <= 5) {
            indice = 0.8;
        } else if (qntProjeto <= 10) {
            indice = 1.0;
        } else if (qntProjeto <= 17) {
            indice = 1.08;
        } else {
            indice = 1.22;
        }

        return ((double) apProjeto / qntProjeto) * indice;
    }
}