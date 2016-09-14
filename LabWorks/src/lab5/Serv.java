/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.*;
import java.net.*;

/**
 *
 * @author stud_5
 */
public class Serv {
    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(6666);
            while(true) {
                Socket s = serverSock.accept();
                PrintWriter writer = new PrintWriter(s.getOutputStream()); 
                writer.println("Have a nice day today! We've got a server now, You're Welcome"); 
                writer.close(); 
            }
        } catch(IOException ex) {
            ex.printStackTrace(); 
        }
    }
    
     public static void main(String[] args) {
        Serv s = new Serv(); 
        s.go();
    }
     
}
    

