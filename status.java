/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
import java.io.*;
/**
 *
 * @author Donya
 */
public class status implements Serializable {
    
    private int s_ID;
    private String sname;

    public status(int s_ID, String sname) {
        this.s_ID = s_ID;
        this.sname = sname;
    }

    public int getS_ID() {
        return s_ID;
    }

    public void setS_ID(int s_ID) {
        this.s_ID = s_ID;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    
public void statno()
        
{ if (getS_ID()== 1)
    this.sname="open";


else if (getS_ID()==2)
    this.sname="close";

}
    
    
}
