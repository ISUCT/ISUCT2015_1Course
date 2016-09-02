/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proga;
import java.io.*;
import java.net.*;

/**
 *
 * @author UI
 */
public class Server {
    public void jButton() {
        try {
            ServerSocket serverSock = new ServerSocket(1818);
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
        Server s = new Server(); 
        s.jButton();
    }
}

