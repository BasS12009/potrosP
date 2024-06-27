/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import Interfaces.ITrasladoDAO;
import dtos.TrasladoDTO;
import converters.TrasladoCVR;
import daos.TrasladoDAO;
import excepciones.DAOException;
import exceptions.BisnessException;
import interfaces.ITrasladoBO;

/**
 * Clase que implementa la interfaz ITrasladoBO y gestiona la lógica de negocio relacionada con traslados.
 * Utiliza objetos de tipo ITrasladoDAO y TrasladoCVR para acceder a los datos y realizar conversiones.
 * 
 * @author skevi
 */
public class TrasladoBO implements ITrasladoBO {

    // Atributos para acceder a los datos y realizar conversiones
    ITrasladoDAO traslado;
    TrasladoCVR trasladoCVR;

    /**
     * Constructor por defecto que inicializa los atributos.
     */
    public TrasladoBO() {
        this.traslado = new TrasladoDAO(); // Inicializa un objeto TrasladoDAO para acceder a los datos de los traslados
        this.trasladoCVR = new TrasladoCVR(); // Inicializa un objeto TrasladoCVR para realizar conversiones
    }
   
    
    /**
     * Método para agregar un nuevo traslado.
     * 
     * @param traslado El objeto TrasladoDTO que se desea agregar.
     * @throws BisnessException si ocurre un error en la lógica de negocio.
     */
    @Override
    public void agregar(TrasladoDTO traslado) throws BisnessException {
        // Implementación pendiente
    }

    /**
     * Método para actualizar un traslado existente.
     * 
     * @param traslado El objeto TrasladoDTO con los nuevos datos.
     * @throws BisnessException si ocurre un error en la lógica de negocio.
     */
    @Override
    public void actualizar(TrasladoDTO traslado) throws BisnessException {
        // Implementación pendiente
    }

    /**
     * Método para buscar un traslado por su número de traslado.
     * Convierte el objeto recuperado de tipo Traslado a un TrasladoDTO antes de retornarlo.
     * 
     * @param numTraslado El número del traslado que se desea buscar.
     * @return El objeto TrasladoDTO si se encuentra, null en caso contrario.
     * @throws BisnessException si ocurre un error en la lógica de negocio.
     */
    @Override
    public TrasladoDTO buscar(int numTraslado) throws BisnessException {
        try {
            // Busca el traslado utilizando el objeto TrasladoDAO y lo convierte a TrasladoDTO
            return trasladoCVR.convertir_DTO(traslado.buscar(numTraslado));
        } catch (DAOException ex) {
            throw new BisnessException(ex.getMessage());
        }
    }

    /**
     * Método para verificar si existe un traslado por su número de traslado.
     * 
     * @param numTraslado El número del traslado que se desea verificar.
     * @return true si el traslado existe, false en caso contrario.
     * @throws BisnessException si ocurre un error en la lógica de negocio.
     */
    @Override
    public boolean existe(int numTraslado) throws BisnessException {
        try {
            // Verifica la existencia del traslado utilizando el objeto TrasladoDAO
            return traslado.existe(numTraslado);
        } catch (DAOException ex) {
            throw new BisnessException(ex.getMessage());
        }
    }
    
}
