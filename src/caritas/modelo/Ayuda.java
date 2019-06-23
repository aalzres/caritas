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
public class Ayuda {

    private String refUsuario;
    private String refAyuda;
    private String tipo;
    private String fechaRec;
    private String descripcion;

    public Ayuda() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaRec() {
        return fechaRec;
    }

    public String getRefAyuda() {
        return refAyuda;
    }

    public String getRefUsuario() {
        return refUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaRec(String fechaRec) {
        this.fechaRec = fechaRec;
    }

    public void setRefAyuda(String refAyuda) {
        this.refAyuda = refAyuda;
    }

    public void setRefUsuario(String refUsuario) {
        this.refUsuario = refUsuario;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
