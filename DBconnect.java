/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.sql.*;
import javax.swing.*;
public class DBconnect {

   public static Connection con = null;


   public static Connection getConnection() {
    // TODO Auto-generated method stub
if (con==null){
 try{ 
        String url="jdbc:sqlserver://localhost\\DESKTOP-NVH7PIU\\SQLEXPRESS:1433;databaseName=OOP";
      String username="donia";
      String password="1234";
   
        Connection con = DriverManager.getConnection(url,username,password);
      Statement stmt=con.createStatement();
    ResultSet myRs = stmt.executeQuery("select * from users");

        System.out.println(myRs.getString(3));
        System.out.println(myRs.getRow());

        while (myRs.next())
        { 
            System.out.println(myRs.getString(3));
            System.out.println(myRs.getString(4));
        }
        myRs.close();
        stmt.close();
        con.close();
        
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null,"Sql server connection problem");}
    }
return con;
   }

}