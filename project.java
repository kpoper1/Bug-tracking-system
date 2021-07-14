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
public class project implements Serializable {
    private String projectname;
    private int pID;

    public project(String projectname, int pID) {
        this.projectname = projectname;
        this.pID = pID;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }
    
    
}
