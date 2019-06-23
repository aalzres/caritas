/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caritas.controlador;

import caritas.modelo.Familiar;
import java.sql.ResultSet;

/**
 *
 * @author asus
 */
public class ControladorFamilia {

    private static ControladorFamilia ca;

    private ControladorFamilia() {
    }

    public static ControladorFamilia getInstance() {
        if (ca == null) {
            ca = new ControladorFamilia();
        }
        return ca;
    }

    /**
     * Create
     *
     * @param f
     * @return
     */
    public boolean addFamiliar(Familiar f) {
        String sql = ""
                + "INSERT INTO FAMILIARES "
                + "(referencia, "
                + "nombre, "
                + "apellidos, "
                + "edad, "
                + "observaciones,"
                + "telefono) "
                + "VALUES ("
                + "'" + f.getRefUsuario() + "', "
                + "'" + f.getNombre() + "', "
                + "'" + f.getApellidos() + "', "
                + "'" + f.getEdad() + "', "
                + "'" + f.getObservaciones() + "', "
                + "'" + f.getTelefono() + "' "
                + ")";
        ControladorDB.getInstance().open();
        int i = ControladorDB.getInstance().executeUpdateOC(sql);
        ControladorDB.getInstance().close();
        return i != 0;
    }

    /**
     * Read
     *
     * @param refUsuario
     * @return
     */
    public ResultSet getFamiliares(String refUsuario) {
        String sql = "SELECT id_familiar, nombre, apellidos, edad, observaciones, telefono "
                + "FROM FAMILIARES "
                + "WHERE referencia like '" + refUsuario + "'";
        ControladorDB.getInstance().open();
        ResultSet resultSet = ControladorDB.getInstance().executeQuery(sql);
        ControladorDB.getInstance().close();
        return resultSet;
    }

    /**
     * Read
     *
     * @param refUsuario
     * @param refFamiliar
     * @return
     */
    public ResultSet getFamiliar(String refUsuario, String refFamiliar) {
        String sql = "SELECT id_familiar, nombre, apellidos, edad, observaciones, telefono "
                + "FROM FAMILIARES "
                + "WHERE referencia like '" + refUsuario + "'"
                + " AND id_familiar like '" + refFamiliar + "'";
        ControladorDB.getInstance().open();
        ResultSet resultSet = ControladorDB.getInstance().executeQuery(sql);
        ControladorDB.getInstance().close();
        return resultSet;
    }

    /**
     * Update
     *
     * @param f
     * @return
     */
    public boolean updateFamiliar(Familiar f) {
        String sql = "UPDATE FAMILIARES SET "
                + "nombre = '" + f.getNombre() + "', "
                + "apellidos = '" + f.getApellidos() + "', "
                + "edad = '" + f.getEdad() + "', "
                + "observaciones = '" + f.getObservaciones() + "', "
                + "telefono = '" + f.getTelefono() + "' "
                + "WHERE id_familiar = " + f.getRefFamiliar() + " ";
        ControladorDB.getInstance().open();
        int i = ControladorDB.getInstance().executeUpdateOC(sql);
        ControladorDB.getInstance().close();
        return i != 0;
    }

    /**
     * Delete
     *
     * @param refUsuario
     * @param refFamiliar
     * @return
     */
    public boolean deleteFamiliar(String refUsuario, String refFamiliar) {
        String sql = "DELETE FROM FAMILIARES "
                + "WHERE id_familiar like '" + refFamiliar + "' AND referencia like '" + refUsuario + "'";
        ControladorDB.getInstance().open();
        int i = ControladorDB.getInstance().executeUpdateOC(sql);
        ControladorDB.getInstance().close();
        return i != 0;
    }
}
