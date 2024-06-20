/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

/**
 *
 * @author caarl
 */

import entidades.Maestro;

import java.util.ArrayList;
import java.util.List;

public class MaestroDAO {
    private Connection conexion;
    
    // Constructor que recibe la conexión
    public MaestroDAOImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public Maestro obtenerMaestroPorId(int id) {
        String query = "SELECT * FROM maestros WHERE id = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(query)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return crearMaestroDesdeResultSet(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Maestro> obtenerTodosMaestros() {
        List<Maestro> maestros = new ArrayList<>();
        String query = "SELECT * FROM maestros";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                maestros.add(crearMaestroDesdeResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maestros;
    }

    @Override
    public List<Maestro> buscarMaestroPorNombre(String nombre) {
        List<Maestro> maestros = new ArrayList<>();
        String query = "SELECT * FROM maestros WHERE nombre LIKE ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(query)) {
            pstmt.setString(1, "%" + nombre + "%");
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    maestros.add(crearMaestroDesdeResultSet(rs));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maestros;
    }

    private Maestro crearMaestroDesdeResultSet(ResultSet rs) throws SQLException {
        Maestro maestro = new Maestro();
        maestro.setId(rs.getInt("id"));
        maestro.setNombre(rs.getString("nombre"));
        // Asigna otros atributos según la estructura de tu tabla
        return maestro;
    }
}