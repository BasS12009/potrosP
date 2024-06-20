/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import excepciones.ControlException;
import interfaz.IHistorialFCD;
import javax.swing.JTable;

/**
 * Clase HistorialFCD que implementa la interfaz IHistorialFCD.
 * Actúa como una fachada para manejar operaciones relacionadas con el historial en una tabla.
 * 
 * Autor: skevi
 */
public class HistorialFCD implements IHistorialFCD {

    /**
     * Método para llenar una tabla con datos históricos.
     * 
     * @param tabla El JTable donde se mostrarán los datos.
     * @param offset Índice de inicio de la paginación.
     * @param limit Número máximo de registros por página.
     * @throws ControlException Si ocurre un error específico de control al llenar la tabla.
     */
    @Override
    public void llenarTablaHistorial(JTable tabla, int offset, int limit) throws ControlException {
        // Aquí se implementará la lógica para llenar la tabla, aún no está implementada.
    }
    
}

