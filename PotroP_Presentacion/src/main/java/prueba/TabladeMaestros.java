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

public class TabladeMaestros extends AbstractTableModel {
private String[] columnNames = {"ID", "Nombre", "Correo", "Departamento"};
    private Object[][] data = {
        {"1", "Juan Pérez", "juan.perez@email.com", "Matemáticas"},
        {"2", "María García", "maria.garcia@email.com", "Matemáticas"},
        {"3", "Carlos Rodríguez", "carlos.rodriguez@email.com", "Ingeniería en software"},
        {"4", "Ana López", "ana.lopez@email.com", "Ingeniería en software"},
        {"5", "Pedro Ramírez", "pedro.ramirez@email.com", "Mecatrónica"},
        {"6", "Lucía Torres", "lucia.torres@email.com", "Mecatrónica"},
        {"7", "Javier Sánchez", "javier.sanchez@email.com", "Turismo"},
        {"8", "Sofía Guzmán", "sofia.guzman@email.com", "Turismo"},
        {"9", "Alejandro Flores", "alejandro.flores@email.com", "Contabilidad"},
        {"10", "Fernanda Martínez", "fernanda.martinez@email.com", "Contabilidad"}
    };

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}