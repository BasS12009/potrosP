/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import DTO.MaestroDTO;
import entidades.Maestro;

public class MaestroCVR {

    /**
     * Convierte un objeto Maestro a un objeto MaestroDTO.
     * 
     * @param maestro El objeto Maestro a convertir.
     * @return Un objeto MaestroDTO con los datos del Maestro.
     */
    public MaestroDTO convertir_DTO(Maestro maestro) {
        if (maestro == null) {
            return null;
        }
        
        return new MaestroDTO(
            maestro.getId(),
            maestro.getNombre(),
            maestro.getCorreo(),
            maestro.getDepartamento()
        );
    }

    /**
     * Convierte un objeto MaestroDTO a un objeto Maestro.
     * 
     * @param maestroDTO El objeto MaestroDTO a convertir.
     * @return Un objeto Maestro con los datos del MaestroDTO.
     */
    public Maestro convertir_Maestro(MaestroDTO maestroDTO) {
        if (maestroDTO == null) {
            return null;
        }
        
        Maestro maestro = new Maestro();
        maestro.setId(maestroDTO.getId());
        maestro.setNombre(maestroDTO.getNombre());
       
        maestro.setCorreo(maestroDTO.getCorreo());
        maestro.setDepartamento(maestroDTO.getDepartamento());
        
        return maestro;
    }
}