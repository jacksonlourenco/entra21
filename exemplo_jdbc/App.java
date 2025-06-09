package exemplo_jdbc;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) {

        DepartamentoDAO depDAO = new DepartamentoDAO();

        try {
            depDAO.inserirDepartamento(new Departamento("Teste"));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
