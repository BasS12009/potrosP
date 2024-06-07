/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTO.PrestamoDTO;
import Exceptions.BisnessException;
import entidades.Prestamo;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author skevi
 */
public interface IPrestamoBO {
    
    public void agregar(PrestamoDTO prestamoDTO) throws BisnessException;
    
    public void eliminar(PrestamoDTO prestamoDTO) throws BisnessException;
    
    public void actualizar(PrestamoDTO prestamoDTO) throws BisnessException;
    
    public Prestamo buscarPorId(int id) throws BisnessException;
     
    public List<PrestamoDTO> listaPrestamos() throws BisnessException;
    
    public List<PrestamoDTO> listaPaginda(int offset, int limit) throws BisnessException;
    
    public List<PrestamoDTO> listaPorFechas(LocalDate begin, LocalDate end) throws BisnessException;
    
}
