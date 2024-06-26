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
 *
 * @author skevi
 */
public class ReporteDAO implements IReporteDAO{

    IConexion conexion;

    public ReporteDAO() {
        this.conexion = new Conexion();
    }
    
    
    @Override
    public void agregar() throws DAOException {
        
    }
    
}
