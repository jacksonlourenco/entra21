package exemplo_jdbc;

public class Departamento {
    private Integer cdDepartamento;
    private String nmDepartamento;

    public Departamento() {
    }

    public Departamento(String nmDepartamento) {
        setNmDepartamento(nmDepartamento);
    }

    public Departamento(Integer cdDepartamento, String nmDepartamento) {
        setCdDepartamento(cdDepartamento);
        setNmDepartamento(nmDepartamento);
    }

    public Integer getCdDepartamento() {
        return cdDepartamento;
    }

    public void setCdDepartamento(Integer cdDepartamento) {
        this.cdDepartamento = cdDepartamento;
    }

    public String getNmDepartamento() {
        return nmDepartamento;
    }

    public void setNmDepartamento(String nmDepartamento) {
        this.nmDepartamento = nmDepartamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departamento{");
        sb.append("cdDepartamento=").append(cdDepartamento);
        sb.append(", nmDepartamento=").append(nmDepartamento);
        sb.append('}');
        return sb.toString();
    }
}
