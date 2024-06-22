/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import DTO.TrasladoDTO;
import converters.TrasladoCVR;
import daos.TrasladoDAO;
import excepciones.DAOException;
import exceptions.BisnessException;
import interfaces.ITrasladoBO;
import interfaces.ITrasladoDAO;

/**
 *
 * @author skevi
 */
public class TrasladoBO implements ITrasladoBO{

    ITrasladoDAO traslado;
    TrasladoCVR trasladoCVR;

    public TrasladoBO() {
        this.traslado = new TrasladoDAO();
        this.trasladoCVR = new TrasladoCVR();
    }
   
    
    @Override
    public void agregar(TrasladoDTO traslado) throws BisnessException {
        
    }

    @Override
    public void actualizar(TrasladoDTO traslado) throws BisnessException {
        
    }

    @Override
    public TrasladoDTO buscar(int numTraslado) throws BisnessException {
        try{
           return trasladoCVR.convertir_DTO(traslado.buscar(numTraslado));
        }
        catch(DAOException ex){
            throw new BisnessException(ex.getMessage());
        }
    }

    @Override
    public boolean existe(int numTraslado) throws BisnessException {
        try{
           return traslado.existe(numTraslado);
        }
        catch(DAOException ex){
            throw new BisnessException(ex.getMessage());
        }
    }
    
}
