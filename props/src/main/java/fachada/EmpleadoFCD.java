/**
 * EmpleadoFCD.java
 * 
 * La clase EmpleadoFCD proporciona métodos para interactuar con 
 * empleados a través de una interfaz gráfica;
 * 
 * Esta clase implementa la interfaz IEmpleadoFCD y utiliza un 
 * controlador (EmpleadoCTL) para manejar las operaciones 
 * relacionadas con los empleados.
 */
package fachada;

import Excepcion.NegocioException;
import Interfaz.IEmpleadoFCD;
import control.EmpleadoCTL;
import dtos.EmpleadoDTO;
import excepcion.PropsException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class EmpleadoFCD implements IEmpleadoFCD{
    
    EmpleadoCTL empleadoCTL;

    /**
     * Constructor que crea una nueva instancia de EmpleadoCTL.
     */
    public EmpleadoFCD() {
        this.empleadoCTL = new EmpleadoCTL();
    }

    /**
     * Muestra los datos de un empleado en una tabla.
     * 
     * @param table La tabla donde se mostrarán los datos del empleado.
     * @param id El ID del empleado que se desea mostrar.
     * @throws PropsException Si ocurre un error relacionado con la obtención de datos del empleado.
     */
    @Override
    public void tablaEmpleado(JTable table, int id) throws PropsException {
        try {
            // Obtener datos del empleado mediante el controlador
            EmpleadoDTO empleado = empleadoCTL.buscarPorID(id);

            // Definir columnas de la tabla
            String[] columnNames = {"ID", "Correo", "Tipo"};

            // Crear modelo de la tabla
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

            // Crear una fila con los datos del empleado
            Object[] rowData = {empleado.getId(), empleado.getCorreo(), empleado.getTipo()};

            // Añadir la fila al modelo de la tabla
            tableModel.addRow(rowData);

            // Establecer el modelo de la tabla
            table.setModel(tableModel);
        } catch (NegocioException e) {
            // Lanzar una PropsException si ocurre un error al obtener los datos del empleado
            throw new PropsException("Error al obtener los datos del empleado.", e);
        }
    }

    /**
     * Busca un empleado por su ID.
     * 
     * @param id El ID del empleado que se desea buscar.
     * @return El objeto EmpleadoDTO que corresponde al ID especificado.
     * @throws PropsException Si ocurre un error relacionado con la búsqueda del empleado.
     */
    @Override
    public EmpleadoDTO buscarPorID(int id) throws PropsException {
        try {
            // Utilizar el controlador para buscar un empleado por su ID
            return empleadoCTL.buscarPorID(id);
        } catch (NegocioException ex) {
            // Lanzar una PropsException si ocurre un error al buscar el empleado
            throw new PropsException(ex.getMessage());        
        }
    }
}