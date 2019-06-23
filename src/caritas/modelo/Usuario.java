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
public class Usuario extends Persona {

    private String refUsuario;
    private String ref;
    private String dni;
    private String movil;
    private String domicilio;
    private String fechaNac;
    private String fechaAlt;
    private String ingresos;
    private String hijos;
    private String situacionLaboral;
    private String estadoCivil;

    public String getDni() {
        return dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getFechaAlt() {
        return fechaAlt;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getHijos() {
        return hijos;
    }

    public String getIngresos() {
        return ingresos;
    }

    public String getMovil() {
        return movil;
    }

    public String getRef() {
        return ref;
    }

    public String getRefUsuario() {
        return refUsuario;
    }

    public String getSituacionLaboral() {
        return situacionLaboral;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setFechaAlt(String fechaAlt) {
        this.fechaAlt = fechaAlt;
    }

    public void setSituacionLaboral(String situacionLaboral) {
        this.situacionLaboral = situacionLaboral;
    }

    public void setRefUsuario(String refUsuario) {
        this.refUsuario = refUsuario;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public void setIngresos(String ingresos) {
        this.ingresos = ingresos;
    }

    public void setHijos(String hijos) {
        this.hijos = hijos;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

}
