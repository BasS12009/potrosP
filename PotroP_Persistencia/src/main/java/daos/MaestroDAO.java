/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Interfaces.IMaestroDAO;
import entidades.Maestro;
import excepciones.DAOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author/(s):
 * [Nombres de los autores]
 */
public class MaestroDAO implements IMaestroDAO {

    private static List<Maestro> lista = new ArrayList<>();

    /**
     * Busca un maestro por su identificador único.
     * 
     * @param id el identificador único del maestro a buscar.
     * @return el maestro encontrado.
     * @throws DAOException si el maestro no se encuentra en la lista.
     */
    public Maestro buscarPorId(int id) throws DAOException {
        for (Maestro maestro : lista) {
            if (maestro.getId() == id) {
                return maestro;
            }
        }
        throw new DAOException("Maestro no encontrado");
    }

    /**
     * Obtiene una lista de todos los maestros almacenados.
     * 
     * @return una lista de todos los maestros almacenados.
     * @throws DAOException si ocurre un error durante la operación.
     */
    public List<Maestro> buscarTodos() throws DAOException {
        return new ArrayList<>(lista);
    }

    /**
     * Guarda un nuevo maestro en la lista.
     * 
     * @param maestro el maestro a guardar.
     * @return el maestro guardado.
     * @throws DAOException si ocurre un error durante la operación.
     */
    public Maestro guardar(Maestro maestro) throws DAOException {
        lista.add(maestro);
        return maestro;
    }

    /**
     * Actualiza un maestro en la lista.
     * 
     * @param maestro el maestro a actualizar.
     * @throws DAOException si el maestro no se encuentra en la lista.
     */
    public void actualizar(Maestro maestro) throws DAOException {
        Maestro maestroExistente = buscarPorId(maestro.getId());
        if (maestroExistente != null) {
            int index = lista.indexOf(maestroExistente);
            lista.set(index, maestro);
        } else {
            throw new DAOException("Maestro no encontrado");
        }
    }

    /**
     * Elimina un maestro de la lista por su ID.
     * 
     * @param id el ID del maestro a eliminar.
     * @throws DAOException si el maestro no se encuentra en la lista.
     */
    public void eliminar(int id) throws DAOException {
        Maestro maestro = buscarPorId(id);
        if (maestro != null) {
            lista.remove(maestro);
        } else {
            throw new DAOException("Maestro no encontrado");
        }
    }

    /**
     * Busca maestros por departamento.
     * 
     * @param departamento el departamento a buscar.
     * @return una lista de maestros del departamento especificado.
     * @throws DAOException si ocurre un error durante la operación.
     */
    public List<Maestro> buscarPorDepartamento(String departamento) throws DAOException {
        List<Maestro> resultado = new ArrayList<>();
        for (Maestro maestro : lista) {
            if (maestro.getDepartamento().equals(departamento)) {
                resultado.add(maestro);
            }
        }
        return resultado;
    }

    /**
     * Busca un maestro por su correo electrónico.
     * 
     * @param correo el correo electrónico del maestro a buscar.
     * @return el maestro encontrado.
     * @throws DAOException si el maestro no se encuentra en la lista.
     */
    public Maestro buscarPorCorreo(String correo) throws DAOException {
        for (Maestro maestro : lista) {
            if (maestro.getCorreo().equals(correo)) {
                return maestro;
            }
        }
        throw new DAOException("Maestro no encontrado");
    }

    
}