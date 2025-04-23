package exercicios_poo.Imposto;

public class Pessoa {
    String nome;
    private String cpf;
    private String uf;
    double rendaAnual;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$")) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF Inválido. Use o formato 000.000.000-00");
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        String[] ufs = { "RS", "PR", "SC" };
        boolean temUf = false;

        for (int i = 0; i < ufs.length; i++) {
            if (uf.equalsIgnoreCase(ufs[i])) {
                temUf = true;
            }
        }

        if (temUf) {
            this.uf = uf;
        } else {
            System.out.println("UF inserido não é válido.");
        }
    }
}
