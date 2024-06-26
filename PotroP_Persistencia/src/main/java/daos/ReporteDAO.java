/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import conexion.Conexion;
import excepciones.DAOException;
import interfaces.IConexion;
import interfaces.IReporteDAO;

/**
 * Clase que implementa la interfaz IReporteDAO y maneja la persistencia de datos de los reportes.
 * 
 * @author skevi
 */
public class ReporteDAO implements IReporteDAO {

    // Atributo para manejar la conexión a la base de datos
    IConexion conexion;

    /**
     * Constructor por defecto que inicializa la conexión.
     */
    public ReporteDAO() {
        this.conexion = new Conexion();
    }
    
    /**
     * Método para agregar un nuevo reporte a la base de datos.
     * Actualmente, este método está vacío y necesita ser implementado.
     * 
     * @throws DAOException si ocurre un error al agregar el reporte.
     */
    @Override
    public void agregar() throws DAOException {
        System.out.println("se agrego el reporte con exito");
    }
}
