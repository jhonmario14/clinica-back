/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javox
 */
public class conexion {
    
    public static conexion instance;//singleton
    private Connection cnn;
    
    private String Drive = "org.postgresql.Driver";
    private String usuario = "admin";
    private String pass = "root";
    private String url = "jdbc:postgresql://localhost:5432/dbiefcv";
     
    private conexion(){
        try {
            Class.forName(Drive);
            cnn = DriverManager.getConnection(url, usuario, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public synchronized static conexion saberEstado(){
        if (instance == null) {
            instance = new conexion();
        }
        return instance;
    }

    public Connection getCnn() {
        return cnn;
    }
    
    public void cerrarConexion(){
        this.instance = null;
    }
    
    
}
