/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rms.businessObjectLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import rms.DeliveryGuyInterface;

/**
 *
 * @author Haier
 */
public class custorder {

    public custorder(int orderno, String[] items, int countitems) {
        this.orderno = orderno;
        this.items = items;
        this.countitems = countitems;
    }
    public void sendorder(){
    try{
     String items[]=this.items;
       boolean check = false;
       System.out.print(this.orderno);
       //Class.forName=(com.mysql.jdbc.Driver);
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rms","root","1234");
       Statement st=con.createStatement();
       for(int i=0;i<this.countitems;i++){
       String sql="INSERT INTO `rms`.`custorder`" +
"(`idcustorder`," +
"`item`)" +
"VALUES('"+this.orderno+"','"+items[i]+"')";
       st.executeUpdate(sql);}
    }   
       catch(Exception e){
       System.out.println(e.getMessage());
       }
    
    }
    public void senddorder(){
    try{
     String items[]=this.items;
       boolean check = false;
       System.out.print(this.orderno);
       //Class.forName=(com.mysql.jdbc.Driver);
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rms","root","1234");
       Statement st=con.createStatement();
       for(int i=0;i<this.countitems;i++){
       String sql="INSERT INTO `rms`.`deliveryorder`" +
"(`deliveryid`," +
"`orderid`)" +
"VALUES('"+this.orderno+"','"+items[i]+"')";
       st.executeUpdate(sql);}
    }   
       catch(Exception e){
       System.out.println(e.getMessage());
       }
    
    }
    public int orderno;
    public String items[];
    public int countitems;
    
    
}
