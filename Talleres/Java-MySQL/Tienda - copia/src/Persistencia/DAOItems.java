/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import static Persistencia.DAOGeneral.getConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alan Sanchez
 */
public class DAOItems extends DAOGeneral {
    public void selectAllItems(){
        try {
            String query = "SELECT * FROM items";
            Statement statement = getConexion().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int idItem = Integer.parseInt(resultSet.getString("idItem"));
                String name = resultSet.getString("name");
                int price = Integer.parseInt(resultSet.getString("price"));
                int idCat = Integer.parseInt(resultSet.getString("id_cat"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOItems.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
