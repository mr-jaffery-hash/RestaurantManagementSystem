/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rms.businessObjectLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import rms.Chef;
import rms.DeliveryGuyInterface;
import rms.ManagerInterface;
import rms.WaiterInterface;

/**
 *
 * @author Lenovo
 */
public class DBImplementation {
    public void getname(){
     try{   
       //Class.forName=(com.mysql.jdbc.Driver);
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rms","root","1234");
       Statement st=con.createStatement();
       String sql="select * from manager";
       ResultSet rs=st.executeQuery(sql);
       while(rs.next()){
       System.out.print(rs.getString("manager_name"));
       }
       }
       catch(Exception e){
       System.out.println(e.getMessage());
       }
     }
    public void loginFunctionManager(String username, String Password){
        /*System.out.print(username);
           System.out.print(Password);*/
     try{
       boolean check = false;
       //Class.forName=(com.mysql.jdbc.Driver);
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rms","root","1234");
       Statement st=con.createStatement();
       String sql="select * from manager";
       ResultSet rs=st.executeQuery(sql);
       while(rs.next()){
           /*System.out.print("I came here");
           System.out.print(rs.getString("manager_name").equals(username));
           System.out.print(rs.getString("password").equals(Password));*/
           if((rs.getString("manager_name").equals(username)==true) && (rs.getString("password").equals(Password)==true)){
               check = true;
               System.out.print("done");         
           }
      //System.out.print(rs.getString("manager_name"));
       }
       if(check==true){
           ManagerInterface mgi = new ManagerInterface();
           mgi.setVisible(true);
    //public manager(int experience, int EmployeeID, int salary, String Grade, String name, int age, String address, String DOB, String CNIC) {

           //manager mgr = new manager()
       }
       }
       catch(Exception e){
       System.out.println(e.getMessage());
       }
     }
    public void loginFunctionwaiter(String username, String Password){
        /*System.out.print(username);
           System.out.print(Password);*/
     try{
       boolean check = false;
       //Class.forName=(com.mysql.jdbc.Driver);
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rms","root","1234");
       Statement st=con.createStatement();
       String sql="select * from waiter";
       ResultSet rs=st.executeQuery(sql);
       while(rs.next()){
           /*System.out.print("I came here");
           System.out.print(rs.getString("manager_name").equals(username));
           System.out.print(rs.getString("password").equals(Password));*/
           if((rs.getString("name").equals(username)==true) && (rs.getString("password").equals(Password)==true)){
               check = true;
               System.out.print("done");         
           }
      //System.out.print(rs.getString("manager_name"));
       }
       if(check==true){
           WaiterInterface mgi = new WaiterInterface(username);
           mgi.setVisible(true);
       }
       }
       catch(Exception e){
       System.out.println(e.getMessage());
       }
     }
   public void loginFunctionchef(String username, String Password){
        /*System.out.print(username);
           System.out.print(Password);*/
     try{
       boolean check = false;
       //Class.forName=(com.mysql.jdbc.Driver);
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rms","root","1234");
       Statement st=con.createStatement();
       String sql="select * from chef";
       ResultSet rs=st.executeQuery(sql);
       while(rs.next()){
           /*System.out.print("I came here");
           System.out.print(rs.getString("manager_name").equals(username));
           System.out.print(rs.getString("password").equals(Password));*/
           if((rs.getString("name").equals(username)==true) && (rs.getString("password").equals(Password)==true)){
               check = true;
               System.out.print("done");         
           }
      //System.out.print(rs.getString("manager_name"));
       }
       if(check==true){
          // Chef mgi = new Chef(username);
          Chef mgi=new Chef(username);
           mgi.setVisible(true);
       }
       }
       catch(Exception e){
       System.out.println(e.getMessage());
       }
     }
   public void loginFunctionDG(String username, String Password){
        /*System.out.print(username);
           System.out.print(Password);*/
     try{
       boolean check = false;
       //Class.forName=(com.mysql.jdbc.Driver);
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rms","root","1234");
       Statement st=con.createStatement();
       String sql="select * from deliveryguy";
       ResultSet rs=st.executeQuery(sql);
       while(rs.next()){
           /*System.out.print("I came here");
           System.out.print(rs.getString("manager_name").equals(username));
           System.out.print(rs.getString("password").equals(Password));*/
           if((rs.getString("name").equals(username)==true) && (rs.getString("password").equals(Password)==true)){
               check = true;
               System.out.print("done");         
           }
      //System.out.print(rs.getString("manager_name"));
       }
       if(check==true){
           DeliveryGuyInterface mgi = new DeliveryGuyInterface();
           mgi.setVisible(true);
       }
       }
       catch(Exception e){
       System.out.println(e.getMessage());
       }
     }
    
     
};
