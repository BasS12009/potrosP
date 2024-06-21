/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author caarl
 */

public class Maestro {
    private int id;
    private String nombre;
    private String correo;
    private String contrasena;
    private String departamento;
    
    /**
     * Constructor por omisión de la clase Maestro.
     */
    public Maestro() {
    }

    /**
     * Constructor de la clase Maestro que inicializa todos los atributos, excepto el id.
     * 
     * @param nombre el nombre del maestro.
     * @param correo el correo electrónico del maestro.
     * @param contrasena la contraseña del maestro.
     * @param departamento el departamento al que pertenece el maestro.
     */
    public Maestro(String nombre, String correo, String contrasena, String departamento) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.departamento = departamento;
    }

    /**
     * Constructor de la clase Maestro que inicializa todos los atributos, incluyendo el id.
     * 
     * @param id el identificador único del maestro.
     * @param nombre el nombre del maestro.
     * @param correo el correo electrónico del maestro.
     * @param contrasena la contraseña del maestro.
     * @param departamento el departamento al que pertenece el maestro.
     */
    public Maestro(int id, String nombre, String correo, String contrasena, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

