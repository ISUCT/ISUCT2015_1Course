/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;


import java.io.*;
import java.net.*;

/**
 *
 * @author stud_5
 */
public class Server {
    public void jButton1() {
        try {
            ServerSocket serverSock = new ServerSocket(1467);
            while(true) {
                Socket s = serverSock.accept();
                PrintWriter writer = new PrintWriter(s.getOutputStream()); 
                writer.println("Hello! How are you? Were are you from?"); 
                writer.close(); 
            }
        } catch(IOException ex) {
            ex.printStackTrace(); 
        }
    }
    
     public static void main(String[] args) {
        Server s = new Server(); 
        s.jButton1();
     }
}

/**
 *
 * @author UI
 */
