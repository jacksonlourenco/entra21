package exemplo_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/departamento";
    private static final String usuario = "root";
    private static final String senha = "@1@senac2021";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }
}
