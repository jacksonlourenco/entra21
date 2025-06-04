package exemplo_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepartamentoDAO {
    // CREATE
    public void inserirDepartamento(Departamento d) throws SQLException {
        String sql = "INSERT INTO departamento (nm_departamento) VALUES (?)";
        try (Connection c = Conexao.conectar();
                PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, d.getNmDepartamento());
            ps.executeUpdate();
        }
    }
    // READ

    // UPDATE
    public void atualizarDepartamento(Departamento d) throws SQLException {
        String sql = "UPDATE departamento SET nm_departamento = ? WHERE cd_departamento = ?";
        try (Connection c = Conexao.conectar();
                PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, d.getNmDepartamento());
            ps.setInt(2, d.getCdDepartamento());
            ps.executeUpdate();
        }
    }

    // DELETE
}
