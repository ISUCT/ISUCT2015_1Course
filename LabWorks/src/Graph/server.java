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
 * @author UI
 */
public class server {
    public void jButton1() {
        try {
            ServerSocket serverSock = new ServerSocket (1480);
            while(true) {
                Socket s = serverSock.accept();
                PrintWriter writer = new PrintWriter(s.getOutputStream());
                writer.println("Have a nice day today!");
                writer.close();
                
            }        
            } catch(IOException ex){
                ex.printStackTrace();
            }
        }
    public static void main(String[] args) {
        server s = new server();
        s.jButton1();
    }
    }
    

