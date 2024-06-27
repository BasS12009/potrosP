/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import excepciones.DAOException;

/**
 * Interfaz que define el método que debe ser implementado por las clases que actúen
 * como capa de acceso a datos para la gestión de reportes.
 * 
 * El método definido en esta interfaz permite realizar la operación de agregar un reporte en el sistema de almacenamiento de datos.
 * Puede lanzar una excepción de tipo DAOException en caso de errores durante la operación.
 * 
 * Esta interfaz está diseñada para desacoplar la lógica específica de acceso a datos de su implementación concreta, 
 * facilitando la modularidad y el intercambio de implementaciones entre diferentes sistemas de almacenamiento.
 * 
 * @author skevi
 */
public interface IReporteDAO {
    
    /**
     * Método para agregar un reporte en el sistema de almacenamiento de datos.
     * 
     * @throws DAOException Si ocurre un error durante la operación de agregado.
     */
    public void agregar() throws DAOException;

}