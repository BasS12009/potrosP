/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import conexion.Conexion;
import entidades.Traslado;
import excepciones.DAOException;
import interfaces.IConexion;
import interfaces.ITrasladoDAO;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author skevi
 */
public class TrasladoDAO implements ITrasladoDAO{

    IConexion conexion;

    public TrasladoDAO() {
        this.conexion = new Conexion();
    }
    
    @Override
    public void agregar(Traslado traslado) throws DAOException {
        
    }

    @Override
    public void actualizar(Traslado traslado) throws DAOException {
        System.out.println("se actualizo con exito");
    }

    @Override
    public Traslado buscar(int numTraslado) throws DAOException {
        
        if (numTraslado == 213) {
        // Variable que representa el día de hoy a las 11:30
        LocalDateTime inicio = LocalDateTime.now()
                                            .with(LocalTime.of(11, 30));
        
        // Variable que representa dos días después a la misma hora (11:30)
        LocalDateTime fin = inicio.plus(2, ChronoUnit.DAYS);
        
        return new Traslado(1, 213, "Campus centro", 2, inicio, fin, "traslado",
        "bien", "bien", 50, "WYZ-212-AS", "examle@gmail.com", "chofer@gmail.com", false);
        }
        return null;
     
    }

    @Override
    public boolean existe(int numTraslado) throws DAOException {
        if (numTraslado == 213) {
            return true;
        }
        return false;
    }
    
    
}
