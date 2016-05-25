package client.server;

import java.io.*;
import java.net.*;

public class Server {
    
    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(1818);
            while(true) {
                Socket s = serverSock.accept();
                PrintWriter writer = new PrintWriter(s.getOutputStream()); 
                writer.println("Hello. ypu got it from server."); 
                writer.close(); 
            }
        } catch(IOException ex) {
            ex.printStackTrace(); 
        }
    }
    
     public static void main(String[] args) {
        Server s = new Server(); 
        s.go();
    }
}