/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import excepciones.ControlException;
import javax.swing.JTable;

/**
 * Interfaz IHistorialFCD que define el contrato para la fachada de manejo del historial en una tabla.
 * 
 * Autor: skevi
 */
public interface IHistorialFCD {
    
    /**
     * Método para llenar una tabla con datos históricos.
     * 
     * @param tabla El JTable donde se mostrarán los datos.
     * @param offset Índice de inicio de la paginación.
     * @param limit Número máximo de registros por página.
     * @throws ControlException Si ocurre un error específico de control al llenar la tabla.
     */
    public void llenarTablaHistorial(JTable tabla, int offset, int limit) throws ControlException;
    
}

