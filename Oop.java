/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import oop.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import oop.DBconnect;
import static oop.Etodev.From;
import static oop.Etodev.To;
import static oop.Etodev.ma;
import static oop.Etodev.subject;
import static oop.adminprojectlist.pID;
import repo.*;

/**
 *
 * @author Donya
 */
public class Oop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        login log = new login();
        testerID tesID = new testerID();
        managerview managv = new managerview();
        developerviiew devv = new developerviiew();
        devID dID = new devID();
        bugtable btable = new bugtable();
   
        adminprojectlist ad = new adminprojectlist();
        Userlist ulist = new Userlist();
        Testerview test = new Testerview();
        Newbug newb = new Newbug();
    }

  
private static JTextField Username;
private static JPasswordField pass;
private static JTextField role;
    static void login(JTextField Username, JPasswordField pass, JTextField role) {
      Oop.Username=Username;
      Oop.pass=pass;
      Oop.role=role;
      
        try {
            String url = "jdbc:sqlserver://localhost\\DESKTOP-NVH7PIU\\SQLEXPRESS:1433;databaseName=OOP";
            String username = "donia";
            String password = "1234";
            Connection con = DriverManager.getConnection(url, username, password);
           

            String Query = "Select * from users where uID='" +  Integer.parseInt(Username.getText()) + "' AND password=  '" + pass.getText() + 
                    "'  And rID='" + Integer.parseInt(role.getText()) + "' ";
            int itemText = (int) Integer.parseInt(role.getText());
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            if (rs.next() == true) {
                JOptionPane.showMessageDialog(null, "username and password matched");
                if (itemText == 1) {
                    new testerID().setVisible(true); 
                }
                if (itemText == 2) {
                   new devID().setVisible(true);
                }
                if (itemText == 3) {
                    new managerview().setVisible(true);
                }
                if (itemText == 4) {
                    new adminprojectlist().setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "user is not found");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }

    }

    private static int parseInt;
   static void devID(int parseInt) {
       Oop.parseInt=parseInt;
        try {
            String url = "jdbc:sqlserver://localhost\\DESKTOP-NVH7PIU\\SQLEXPRESS:1433;databaseName=OOP";
            String username = "donia";
            String password = "1234";
            Connection con = DriverManager.getConnection(url, username, password);

            String Query = "Select * from  developer where dev_id='" + parseInt + "' ";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            if (rs.next() == true) {

                new developerviiew().setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "user is not found");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
private static JTextField uID;
private static JTextField user_name;
private static JTextField passw;
private static JTextField roleID;
    static void adduser(JTextField uID, JTextField user_name, JTextField passw, JTextField roleID) {
        Oop.uID=uID;
        Oop.user_name= user_name;
        Oop.passw=passw;
        Oop.roleID=roleID;
        
        try {
            String url = "jdbc:sqlserver://localhost\\DESKTOP-NVH7PIU\\SQLEXPRESS:1433;databaseName=OOP";
            String username = "donia";
            String password = "1234";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String Query = "INSERT INTO users(uID, uname, password, rID) VALUES('" + uID.getText() + "','" + user_name.getText() + "','" + passw.getText() + "','" + roleID.getText() + "')";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "user is added to database");
            uID.setText(null);
            user_name.setText(null);
            passw.setText(null);
            roleID.setText(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }

    static void updateuser(JTextField user_name, JTextField pass, JTextField roleID, JTextField uID) {
        try {
            String url = "jdbc:sqlserver://localhost\\DESKTOP-NVH7PIU\\SQLEXPRESS:1433;databaseName=OOP";
            String username = "donia";
            String password = "1234";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String query1 = "update users set uname='" + user_name.getText() + "' , password='" + pass.getText() + "',rID= " + Integer.parseInt(roleID.getText()) + " where uID=" + Integer.parseInt(uID.getText()) + "";
       
         stmt.executeUpdate(query1);
            JOptionPane.showMessageDialog(null, "data updated");
            stmt.close();
            con.close();

           
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "User is not found");

        }
    }
  

   static void deleteuser(JTextField uID) {
        try {
            String url = "jdbc:sqlserver://localhost\\DESKTOP-NVH7PIU\\SQLEXPRESS:1433;databaseName=OOP";
            String username = "donia";
            String password = "1234";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String Query = "delete from users where uID='" + Integer.parseInt(uID.getText()) + "'";
//       
                 stmt.execute(Query);

            JOptionPane.showMessageDialog(null, "user is deleted from database");
             
            
           
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "User is not found");

        }
    }
   
   private static JTextField bs;
private static JTextField bi;
   
  static void updateStat ( JTextField bs, JTextField bi)
    {
        Oop.bs=bs;
        Oop.bi=bi;
        try {
            String url = "jdbc:sqlserver://localhost\\DESKTOP-NVH7PIU\\SQLEXPRESS:1433;databaseName=OOP";
            String username = "donia";
            String password = "1234";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String query1 = "update tester set status= '" + Integer.parseInt(bs.getText()) + "' where bID= '" + Integer.parseInt(bi.getText()) + "' ";
         stmt.executeUpdate(query1);
           stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Status updated");
          

           
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Status not updated");

        }
    }
  
  private static JTextField bugID;
private static JTextField Namebug;
private static JTextField bugtype;
private static JTextField priority;
private static JTextField level;
private static JTextField projectID;
private static JTextField bugdate;
private static JTextField statusID;
private static JTextField devID;
private static JTextField screenshot;
    static void addbug(JTextField bugID, JTextField Namebug, JTextField bugtype, JTextField priority, JTextField level, JTextField projecID, JTextField bugdate, JTextField statusID, JTextField devID, JTextField screenshot) {
      Oop.bugID=bugID;
      Oop.Namebug=Namebug;
      Oop.bugtype=bugtype;
      Oop.priority=priority;
      Oop.level=level;
      Oop.projectID=projecID;
      Oop.bugdate=bugdate;
      Oop.statusID=statusID;
      Oop.devID=devID;
      Oop.screenshot=screenshot;
        try {
            String url = "jdbc:sqlserver://localhost\\DESKTOP-NVH7PIU\\SQLEXPRESS:1433;databaseName=OOP";
            String username = "donia";
            String password = "1234";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String Query = "INSERT INTO bugs(bID, bname, priority, btype, level, pID, bdate, s_id,assign_devID, screenshot) VALUES('" + bugID.getText() + "','" + Namebug.getText() + "','" + bugtype.getText() + "','" + priority.getText() + "', '" + level.getText() + "', '" + projecID.getText() + "','" + bugdate.getText() + "','" + statusID.getText() + "','" + devID.getText() + "','" + screenshot.getText() + "')";
            
   
           
                  stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "bug added to database");
            bugID.setText(null);
            Namebug.setText(null);
            bugtype.setText(null);
            priority.setText(null);
            level.setText(null);
            projecID.setText(null);
            bugdate.setText(null);
            statusID.setText(null);
            devID.setText(null);

      
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }
static void email(JTextField To, JTextField From, JPasswordField passw, JTextArea ma, JTextField subject)
{
    String Toemail= To.getText();
       String Fromemail= From.getText();
       String FromemailPass= passw.getText();
       String Subjects= subject.getText();
    Properties prop= new Properties();
   prop.put("mail.smtp.host", "smtp.gmail.com");
    prop.put("mail.smtp.port", "587");
    prop.put("mail.smtp.starttls.enable", "true");
    prop.put("mail.smtp.auth", "true");
      Session session = Session.getDefaultInstance(prop,new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication (Fromemail , FromemailPass); 
            }
        });
            
    try {
    MimeMessage message= new MimeMessage(session);
    message.setFrom(new InternetAddress(Fromemail));
    message.addRecipient(Message.RecipientType.TO, new InternetAddress(Toemail));
    message.setSubject(Subjects);
    message.setText(ma.getText());
    Transport.send(message);
      JOptionPane.showMessageDialog(null, "Email sent");
    }
    catch (Exception ex){
        System.out.println(""+ex);
    }
}
   static void testID(int parseInt, JTextField tname ) {
          try {
            String url = "jdbc:sqlserver://localhost\\DESKTOP-NVH7PIU\\SQLEXPRESS:1433;databaseName=OOP";
            String username = "donia";
            String password = "1234";
            Connection con = DriverManager.getConnection(url, username, password);

            String Query = "Select * from  tester where testID='" + parseInt + "' and t_name='" + tname.getText() + "'";
           
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            if (rs.next() == true) {
        
                    new Testerview().setVisible(true);
                

            } else {
                JOptionPane.showMessageDialog(null, "user is not found");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }

    void project(JTextField pID) {
            try {
            String url = "jdbc:sqlserver://localhost\\DESKTOP-NVH7PIU\\SQLEXPRESS:1433;databaseName=OOP";
            String username = "donia";
            String password = "1234";
            Connection con = DriverManager.getConnection(url, username, password);

            String Query = "Select * from  bugs where pID='" + Integer.parseInt(pID.getText()) + "' ";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            if (rs.next() == true) {

                new projectbugTable().setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "user is not found");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
     //To change body of generated methods, choose Tools | Templates.
    }

    


}
