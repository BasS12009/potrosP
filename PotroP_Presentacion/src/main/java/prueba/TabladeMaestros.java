/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author caarl
 */

import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TabladeMaestros extends AbstractTableModel {
    private String[] columnNames = {"ID", "Nombre", "Correo", "Departamento"};
    private List<Object[]> data = new ArrayList<>();

    public TabladeMaestros() {
        // Conectar a la base de datos y cargar datos
        loadDataFromDatabase();
    }

    private void loadDataFromDatabase() {
        String url = "jdbc:mysql://localhost:3306/itson"; // URL de la base de datos
        String username = "root";
        String password = "Bi0log1a1";

        String query = "SELECT id, nombre, correo, departamento FROM maestros";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Object[] row = new Object[4];
                row[0] = resultSet.getInt("id");
                row[1] = resultSet.getString("nombre");
                row[2] = resultSet.getString("correo");
                row[3] = resultSet.getString("departamento");
                data.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data.get(rowIndex)[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}