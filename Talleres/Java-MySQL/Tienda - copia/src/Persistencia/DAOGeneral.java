/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alan Sanchez
 */
public class DAOGeneral {
    private static Connection Conexion;

    public DAOGeneral() {
            MySQLConnection("root", "root", "tienda");
        
    }
    
    
    
     private void MySQLConnection(String user, String pass, String db_name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:33065/" + db_name, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOGeneral.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Cierra la conexión con la base de datos
    public void closeConnection() {
        try {
            Conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConexion() {
        return Conexion;
    }
}
