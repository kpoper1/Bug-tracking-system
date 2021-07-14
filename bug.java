/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
import java.io.*;
import oop.*;
/**
 *
 * @author Donya
 */
public class bug implements Serializable{
        
   public int bID;
    public String bname;
    public String priority; 
    public String btype;   
    public String bdate;
    public String level;  
    public String status;
    public int s_id;
    public String pname;
    public int pID;
    public int assign_devID;

    
          /*  public void emaildev(){
        System.out.println("bug name "+bname+", "+"bug type " +btype+", "+ "priority "+ priority+", "+
            "bug level "  +  level+", "+"project name "+ pname+", "+ "bug date "+ bdate+", "+"status "+status);
    }
    public String stat(String status)
    {
       return status;
    } */

    public bug(int bID, String bname, String btype, String priority, String level, String pname, String bdate, String status, int s_id, int pID, int assign_devID) {
        this.bID = bID;
        this.bname = bname;
        this.btype = btype;
        this.priority = priority;
        this.level = level;
        this.pname = pname;
        this.bdate = bdate;
        this.status = status;
           this.s_id=s_id; 
                  this.pID= pID;
                  this.assign_devID= assign_devID;
    

        
    }



  
   

    public int getbID() {
        return bID;
    }

    public void setbID(int bID) {
        this.bID = bID;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
      public int getDevID() {
        return assign_devID;
    }

    public void setDevID(int devID) {
        this.assign_devID = devID;
    }
    
     public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }
   
     
}
