/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caritas.controlador;

import caritas.modelo.Usuario;
import java.sql.ResultSet;

/**
 *
 * @author asus
 */
public class ControladorUsuario {

    private static ControladorUsuario cc;

    private ControladorUsuario() {
    }

    public static ControladorUsuario getInstance() {
        if (cc == null) {
            cc = new ControladorUsuario();
        }
        return cc;
    }

    /**
     * Create
     *
     * @param c
     * @return
     */
    public boolean addUsuario(Usuario c) {
        String sql = ""
                + "INSERT INTO CLIENTES "
                + "(Nombre,"
                + "Apellidos,"
                + "Telefono,"
                + "Movil,"
                + "Fechanac,"
                + "Fechaalt,"
                + "DNI,"
                + "Domicilio,"
                + "Observaciones,"
                + "Estadocivil,"
                + "Situacionlaboral,"
                + "Ingresos,"
                + "Hijos) "
                + "VALUES ("
                + "'" + c.getNombre() + "',"
                + "'" + c.getApellidos() + "',"
                + "'" + c.getTelefono() + "',"
                + "'" + c.getMovil() + "',"
                + "'" + c.getTelefono() + "',"
                + "'" + c.getFechaAlt() + "',"
                + "'" + c.getDni() + "',"
                + "'" + c.getDomicilio() + "',"
                + "'" + c.getObservaciones() + "',"
                + "'" + c.getEstadoCivil() + "',"
                + "'" + c.getSituacionLaboral() + "',"
                + "" + c.getIngresos() + ","
                + "" + c.getHijos() + ")";
        ControladorDB.getInstance().open();
        int i = ControladorDB.getInstance().executeUpdateOC(sql);
        ControladorDB.getInstance().close();
        return i != 0;
    }

    /**
     * Read
     *
     * @param filtro
     * @return
     */
    public ResultSet getUsuarios(String filtro) {
        String sql = "SELECT Referencia, Nombre, Apellidos, DNI "
                + "FROM CLIENTES "
                + "WHERE referencia like '%" + filtro + "%' "
                + "OR nombre like '%" + filtro + "%' "
                + "OR apellidos like '%" + filtro + "%' "
                + "OR dni like '%" + filtro + "%' "
                + "ORDER BY apellidos";
        ControladorDB.getInstance().open();
        ResultSet resultSet = ControladorDB.getInstance().executeQuery(sql);
        ControladorDB.getInstance().close();
        return resultSet;
    }

    /**
     * Read
     *
     * @param refUsuario
     * @return
     */
    public ResultSet getUsuario(String refUsuario) {
        String sql = "SELECT * "
                + "FROM CLIENTES "
                + "WHERE referencia like '" + refUsuario + "' ";
        ControladorDB.getInstance().open();
        ResultSet resultSet = ControladorDB.getInstance().executeQuery(sql);
        ControladorDB.getInstance().close();
        return resultSet;
    }

    /**
     * Update
     *
     * @param u
     * @return
     */
    public boolean updateUsuario(Usuario u) {
        String sql = "UPDATE CLIENTES SET "
                + "nombre = '" + u.getNombre() + "', "
                + "apellidos = '" + u.getApellidos() + "', "
                + "dni = '" + u.getDni() + "', "
                + "telefono = '" + u.getTelefono() + "', "
                + "movil = '" + u.getMovil() + "', "
                + "domicilio = '" + u.getDomicilio() + "', "
                + "fechanac = '" + u.getFechaNac() + "', "
                + "fechaalt = '" + u.getFechaAlt() + "', "
                + "observaciones = '" + u.getObservaciones() + "', "
                + "ingresos = " + u.getIngresos() + ", "
                + "hijos = " + u.getHijos() + ", "
                + "situacionlaboral = '" + u.getSituacionLaboral() + "', "
                + "estadocivil = '" + u.getEstadoCivil() + "'  "
                + "WHERE referencia = " + u.getRef();
        ControladorDB.getInstance().open();
        int i = ControladorDB.getInstance().executeUpdateOC(sql);
        ControladorDB.getInstance().close();
        return i != 0;
    }

    /**
     * Delete
     *
     * @param nif
     * @return
     */
    public boolean deleteUsuario(String nif) {
        String sql = "DELETE FROM CLIENTES "
                + "WHERE dni like '" + nif + "' ";
        ControladorDB.getInstance().open();
        int i = ControladorDB.getInstance().executeUpdateOC(sql);
        ControladorDB.getInstance().close();
        return i != 0;
    }

}
