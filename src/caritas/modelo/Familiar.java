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
public class Familiar extends Persona {

    private String refUsuario;
    private String refFamiliar;
    private String edad;

    public String getEdad() {
        return edad;
    }

    public String getRefFamiliar() {
        return refFamiliar;
    }

    public String getRefUsuario() {
        return refUsuario;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setRefFamiliar(String refFamiliar) {
        this.refFamiliar = refFamiliar;
    }

    public void setRefUsuario(String refUsuario) {
        this.refUsuario = refUsuario;
    }

}
