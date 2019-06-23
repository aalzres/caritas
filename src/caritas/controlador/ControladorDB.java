/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caritas.controlador;

import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
class ControladorDB {

    private java.sql.Connection connection;
    private java.sql.Statement statement;
    private java.sql.ResultSet resultSet;

    private String bbdd;
    private String user;
    private String pass;

    private static ControladorDB cdb;

    private ControladorDB() {
        try {
            bbdd = System.getProperty("user.dir") + File.separator + "Caritas" + File.separator + "db" + File.separator + "caritas.mdb";
            user = "admin";
            pass = "caritas";
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Error al cargar el controlador");
            System.err.println(ex.getMessage());
            System.exit(0);
        }
    }

    public static ControladorDB getInstance() {
        if (cdb == null) {
            cdb = new ControladorDB();
        }
        return cdb;
    }

    public void open() {
        try {
            connection = DriverManager.getConnection("jdbc:ucanaccess://" + bbdd, user, pass);
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.err.println("Mensaje:" + e.getMessage());
            System.err.println("Estado:" + e.getSQLState());
            System.err.println("Codigo del error:" + e.getErrorCode());
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "Mensaje:" + e.getMessage() + "\n"
                    + "Estado: " + e.getSQLState() + "\n"
                    + "Codigo de error:" + e.getErrorCode(),
                    "Error de consulta", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void close() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public ResultSet executeQuery(String sql) {
        resultSet = null;
        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            System.err.println("Mensaje:" + e.getMessage());
            System.err.println("Estado:" + e.getSQLState());
            System.err.println("Codigo del error:" + e.getErrorCode());
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "Mensaje:" + e.getMessage() + "\n"
                    + "Estado: " + e.getSQLState() + "\n"
                    + "Codigo de error:" + e.getErrorCode(),
                    "Error de consulta", JOptionPane.ERROR_MESSAGE);
        }
        return resultSet;

    }

    public ResultSet executeQueryOC(String sql) {
        open();
        resultSet = null;
        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            System.err.println("Mensaje:" + e.getMessage());
            System.err.println("Estado:" + e.getSQLState());
            System.err.println("Codigo del error:" + e.getErrorCode());
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "Mensaje:" + e.getMessage() + "\n"
                    + "Estado: " + e.getSQLState() + "\n"
                    + "Codigo de error:" + e.getErrorCode(),
                    "Error de consulta", JOptionPane.ERROR_MESSAGE);
        }
        close();
        return resultSet;
    }

    public Integer executeUpdate(String sql) {
        try {
            return statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println("Mensaje:" + e.getMessage());
            System.err.println("Estado:" + e.getSQLState());
            System.err.println("Codigo del error:" + e.getErrorCode());
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "Mensaje:" + e.getMessage() + "\n"
                    + "Estado: " + e.getSQLState() + "\n"
                    + "Codigo de error:" + e.getErrorCode(),
                    "Error de consulta", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Integer executeUpdateOC(String sql) {
        open();
        try {
            return statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println("Mensaje:" + e.getMessage());
            System.err.println("Estado:" + e.getSQLState());
            System.err.println("Codigo del error:" + e.getErrorCode());
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "Mensaje:" + e.getMessage() + "\n"
                    + "Estado: " + e.getSQLState() + "\n"
                    + "Codigo de error:" + e.getErrorCode(),
                    "Error de consulta", JOptionPane.ERROR_MESSAGE);
        }
        close();
        return null;
    }
}
