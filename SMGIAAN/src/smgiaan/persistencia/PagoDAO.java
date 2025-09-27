/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smgiaan.persistencia;

import smgiaan.modelo.Pago;
import java.sql.*;

public class PagoDAO {

    private Connection getConnection() throws SQLException {
        // Ajusta la URL, usuario y clave según tu DB
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/atletas",
                "fidiantest",
                "9n9jCHb9"
        );
    }

    public void insertar(Pago p) throws SQLException {
        String sql = "INSERT INTO pagos (atleta_id, mes, periodo, monto, fechaGenerado) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, p.getAtletaId());
            ps.setInt(2, p.getMes());
            ps.setString(3, p.getPeriodo());
            ps.setDouble(4, p.getMonto());
            ps.setDate(5, Date.valueOf(p.getFechaGenerado()));

            ps.executeUpdate();

            // obtener ID generado
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    p.setId(rs.getInt(1));  // asigna el ID autogenerado
                }
            }
        }
    }
}

