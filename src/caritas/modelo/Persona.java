/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caritas.modelo;

/**
 *
 * @author asus
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private String telefono;
    private String observaciones;

    public Persona() {
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
