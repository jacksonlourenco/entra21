package exercicios_poo.Onibus;

public class OnibusEscolar {
    private int qntEstudante;
    private int qntProfessores;

    public int getQntEstudante() {
        return qntEstudante;
    }

    public void setQntEstudante(int qntEstudante) {
        int maxEstudante = 40;
        if (qntEstudante <= maxEstudante && qntEstudante > 0) {
            this.qntEstudante = qntEstudante;
        } else if (qntEstudante > maxEstudante) {
            qntEstudante = maxEstudante;
            this.qntEstudante = qntEstudante;
        } else {
            throw new IllegalArgumentException("Insira um valor positivo de 1 a 40.");
        }
    }

    public int getQntProfessores() {
        return qntProfessores;
    }

    public void setQntProfessores(int qntProfessores) {

        if (qntProfessores > 0 && qntProfessores < 40) {
            this.qntProfessores = qntProfessores;
        } else if (qntProfessores == 0) {
            this.qntProfessores = qntProfessores;
            this.qntEstudante = 0;
        } else {
            throw new IllegalArgumentException("Insira um valor positivo de 1 a 40.");
        }
    }

    public void removerEstudante(int estudantes) {

        this.qntEstudante -= estudantes;

        if (this.qntEstudante < 0) {
            this.qntEstudante = 0;
        }
    }

    public void adicionarEstudante(int estudantes) {
        this.qntEstudante += estudantes;

        if (this.qntEstudante > 40) {
            this.qntEstudante = 40;
        }
    }

}
