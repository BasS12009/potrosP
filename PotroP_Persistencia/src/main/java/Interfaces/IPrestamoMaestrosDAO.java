/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author caarl
 */
import entidades.PrestamoMaestros;
import excepciones.DAOException;
import java.util.List;
import org.bson.types.ObjectId;

public interface IPrestamoMaestrosDAO {
    
    public void agregar(PrestamoMaestros prestamoMaestros) throws DAOException;
    
    public PrestamoMaestros buscarPorId(ObjectId id) throws DAOException;
    
    
    public List<PrestamoMaestros> listaPrestamosMaestros() throws DAOException;
    
}
