/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caritas.controlador;

import caritas.modelo.Ayuda;
import java.sql.ResultSet;

/**
 *
 * @author asus
 */
public class ControladorAyuda {

    private static ControladorAyuda ca;

    private ControladorAyuda() {
    }

    public static ControladorAyuda getInstance() {
        if (ca == null) {
            ca = new ControladorAyuda();
        }
        return ca;
    }

    /**
     * Create
     *
     * @param a
     * @return
     */
    public boolean addAyuda(Ayuda a) {
        String sql = ""
                + "INSERT INTO AYUDAS "
                + "(referencia, "
                + "tipo, "
                + "fecharec, "
                + "descripcion) "
                + "VALUES ("
                + "'" + a.getRefUsuario() + "',"
                + "'" + a.getTipo() + "',"
                + "'" + a.getFechaRec() + "',"
                + "'" + a.getDescripcion() + "')";
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
    public ResultSet getAyudas(String refUsuario) {
        String sql = "SELECT id_ayuda, tipo, fecharec, descripcion "
                + "FROM AYUDAS "
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
     * @param refAyuda
     * @return
     */
    public ResultSet getAyuda(String refUsuario, String refAyuda) {
        String sql = "SELECT id_ayuda, tipo, fecharec, descripcion "
                + "FROM AYUDAS "
                + "WHERE referencia like '" + refUsuario + "'"
                + " AND id_ayuda like '" + refAyuda + "'";
        ControladorDB.getInstance().open();
        ResultSet resultSet = ControladorDB.getInstance().executeQuery(sql);
        ControladorDB.getInstance().close();
        return resultSet;
    }

    /**
     * Update
     *
     * @param a
     * @return
     */
    public boolean updateAyuda(Ayuda a) {
        String sql = "UPDATE AYUDAS SET "
                + "descripcion = '" + a.getDescripcion() + "', "
                + "fecharec = '" + a.getFechaRec() + "', "
                + "tipo = '" + a.getTipo() + "' "
                + "WHERE id_ayuda = " + a.getRefAyuda() + " ";
        ControladorDB.getInstance().open();
        int i = ControladorDB.getInstance().executeUpdateOC(sql);
        ControladorDB.getInstance().close();
        return i != 0;
    }

    /**
     * Delete
     *
     * @param refUsuario
     * @param refAyuda
     * @return
     */
    public boolean deleteAyuda(String refUsuario, String refAyuda) {
        String sql = "DELETE FROM AYUDAS "
                + "WHERE id_ayuda like '" + refAyuda + "' AND referencia like '" + refUsuario + "'";
        ControladorDB.getInstance().open();
        int i = ControladorDB.getInstance().executeUpdateOC(sql);
        ControladorDB.getInstance().close();
        return i != 0;
    }
}
