/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Interfaces.IAdministradorDAO;
import entidades.Administrador;
import excepciones.DAOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caarl
 */
public class AdministradorDAO implements IAdministradorDAO{

    private static List<Administrador> lista = new ArrayList();

    public AdministradorDAO() {
       
    }
    
    @Override
    public void agregar(Administrador administrador) throws DAOException {
        this.lista.add(administrador);
    }

    @Override
    public List<Administrador> listaAdministradores() throws DAOException {
        return this.lista;
    }
    
}
