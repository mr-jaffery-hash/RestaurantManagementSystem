/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rms;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager; 
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author Lenovo
 */
public class Rms {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        try {
            // TODO code application logic here
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://DESKTOP-E3EOGA4;databaseName=rms;integratedSecurity=true";
            java.sql.Connection con = DriverManager.getConnection(dburl);
            java.sql.Statement stat = con.createStatement();
            String query = "Select * from customer";
            ResultSet rs= stat.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rms.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
