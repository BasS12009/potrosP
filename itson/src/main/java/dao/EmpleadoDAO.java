/**
 * EmpleadoDAO.java
 * 
 * Implementación de la interfaz IEmpleadoDAO para el acceso y 
 * manipulación de datos de empleados; Gestiona listas de empleados, 
 * administradores y choferes, y proporciona métodos para registrar, 
 * buscar y listar empleados.
 * 
 */
package dao;

import Excepcion.PersistenciaException;
import entidades.Empleado;
import java.util.ArrayList;
import java.util.List;
import interfaces.IEmpleadoDAO;
/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
    public class EmpleadoDAO implements IEmpleadoDAO{

    public static List<Empleado> listaEmpleados = new ArrayList();
    private static List<Empleado> listaAdministradores = new ArrayList();
    private static List<Empleado> listaChoferes = new ArrayList();
    
    
    /**
     * Obtiene una lista paginada de empleados a partir de un desplazamiento 
     * (offset) y un límite (limit).
     * 
     * @param offset El desplazamiento inicial de la lista.
     * @param limit La cantidad máxima de empleados a retornar.
     * @return Una lista de objetos {@link Empleado}.
     * @throws PersistenciaException Si ocurre un error durante la obtención de los empleados.
     */
    @Override
    public List<Empleado> ListaEmpleados(int offset, int limit) throws PersistenciaException {
        List<Empleado> listaAlterna = new ArrayList<>();

        for (Empleado empleado : listaEmpleados) {
            if (empleado.getId() >= offset) {
                listaAlterna.add(empleado);
            }
        }

        List<Empleado> listaPaginada = new ArrayList<>();
        for (int i = 0; i < limit && i < listaAlterna.size(); i++) {
            listaPaginada.add(listaAlterna.get(i));
        }

        return listaPaginada;
    }

    /**
     * Busca un empleado por su ID, recibiéndo como parámetro el ID por medio de
     * un valor entero;
     * 
     * Si el ID es menor a 1, significa que el empleado seleccionado no existe 
     * en la base de datos; por lo tanto, mandará una excepción de tipo 
     * PersistenciaException indicando que el empleado no existe;
     * 
     * En caso de que el ID seleccionado sea mayor que 1, se recorrerá la lista
     * de empleados por medio de un Objeto tipo Empleado, recorriendo la lista
     * existente hasta encontrar al empleado buscado en el parámetro.
     * 
     * @param id El ID del empleado a buscar.
     * @return El objeto Empleado correspondiente al empleado encontrado.
     * @throws PersistenciaException Si el ID es inválido o el empleado no existe.
     */
    @Override
    public Empleado buscarEmpleado(int id) throws PersistenciaException {
        if (id < 1) {
            throw new PersistenciaException("El Empleado no existe");
        } else {
            for (Empleado empleado : listaEmpleados) {
                if (empleado.getId() == id) {
                    return empleado;
                }
            }
        }
        return null;
    }

    /**
     * Verifica la existencia de un administrador, recibiéndo como parámetro un
     * objeto Empleado por medio de la instancia empleado;
     * 
     * Si el objeto empleado es nulo, significa que el empleado seleccionado no existe 
     * en la base de datos; por lo tanto, mandará una excepción de tipo 
     * PersistenciaException indicando que el empleado no existe;
     * 
     * En caso de que la instancia empleado no sea nulo, se recorrerá la lista,
     * recorriendo la lista existente hasta encontrar al empleado buscado en el 
     * parámetro.
     * 
     * @param empleado El objeto Empleado que contiene los datos del administrador a verificar.
     * @return true si el administrador existe, false en caso contrario.
     * @throws PersistenciaException Si el objeto empleado es nulo.
     */
    @Override
    public boolean existenciaAdmin(Empleado empleado) throws PersistenciaException {
        if (empleado == null) {
            throw new PersistenciaException("Administrador nulo");
        } else {
            for (int i = 0; i < listaAdministradores.size(); i++) {
                if (listaAdministradores.get(i).getCorreo().equalsIgnoreCase(empleado.getCorreo())) {
                    if (listaAdministradores.get(i).getContraseña().equalsIgnoreCase(empleado.getContraseña())) {
                        return true;
                    }
                }
                break;
            }
            }
        return false;
        }
    

    /**
     * Registra un nuevo empleado;
     * 
     * Si el empleado recibido como parámetro del objeto tipo Empleado es nulo,
     * entonces se mandará a llamar a una excepción de persistencia, indicando
     * con un mensaje que el Empleado es nulo;
     * 
     * En caso de que el empleado recibido en el parámetro no sea nulo, entonces
     * se mandará a llamar un método de instancia de la clase entidad Empleado
     * que obtendrá su tipo sin importar mayúsculas o minúsculas, lo filtrará y
     * se agregará a una lista de empleados.
     * 
     * @param empleado El objeto Empleado que contiene los datos del empleado a registrar.
     * @throws PersistenciaException Si el objeto empleado es nulo.
     */
    @Override
    public void registrarEmpleado(Empleado empleado) throws PersistenciaException {
        if (empleado == null) {
            throw new PersistenciaException("Empleado nulo");
        } else if (empleado.getTipo().equalsIgnoreCase("EMPLEADO")) {
            listaEmpleados.add(empleado);
        }
    }

    /**
     * Registra un nuevo administrador.
     * 
     * Si el empleado recibido como parámetro del objeto tipo Empleado es nulo,
     * entonces se mandará a llamar a una excepción de persistencia, indicando
     * con un mensaje que el administrador es nulo;
     * 
     * En caso de que el empleado recibido en el parámetro no sea nulo, entonces
     * se mandará a llamar un método de instancia de la clase entidad Empleado
     * que obtendrá su tipo sin importar mayúsculas o minúsculas, lo filtrará y
     * se agregará a una lista de empleados como administrador.
     * 
     * @param empleado El objeto Empleado que contiene los datos del administrador a registrar.
     * @throws PersistenciaException Si el objeto empleado es nulo.
     */
    @Override
    public void registrarAdministrador(Empleado empleado) throws PersistenciaException {
        if (empleado == null) {
            throw new PersistenciaException("Administrador nulo");
        } else if (empleado.getTipo().equalsIgnoreCase("ADMINISTRADOR")) {
            listaEmpleados.add(empleado);
        }
    }

    /**
     * Registra un nuevo chofer.
     * 
     * Si el empleado recibido como parámetro del objeto tipo Empleado es nulo,
     * entonces se mandará a llamar a una excepción de persistencia, indicando
     * con un mensaje que el chofer es nulo;
     * 
     * En caso de que el empleado recibido en el parámetro no sea nulo, entonces
     * se mandará a llamar un método de instancia de la clase entidad Empleado
     * que obtendrá su tipo sin importar mayúsculas o minúsculas, lo filtrará y
     * se agregará a una lista de empleados como chofer.
     * 
     * @param empleado El objeto Empleado que contiene los datos del chofer a registrar.
     * @throws PersistenciaException Si el objeto empleado es nulo.
     */
    @Override
    public void registrarChofer(Empleado empleado) throws PersistenciaException {
        if (empleado == null) {
            throw new PersistenciaException("Chofer nulo");
        } else if (empleado.getTipo().equalsIgnoreCase("CHOFER")) {
            listaChoferes.add(empleado);
        }
    }
}