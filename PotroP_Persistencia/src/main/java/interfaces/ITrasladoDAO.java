/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import entidades.Traslado;
import excepciones.DAOException;
import org.bson.types.ObjectId;

/**
 *
 * @author diana
 */
public interface ITrasladoDAO {
    
    public void agregar(Traslado traslado) throws DAOException;
    
    public Traslado buscarPorId(ObjectId id) throws DAOException;
}
