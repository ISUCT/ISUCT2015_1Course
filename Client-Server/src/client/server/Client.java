package client.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    
    public void go() {
        try {
            Socket s = new Socket("192.168.12.205", 1818); 
            InputStreamReader stream = new InputStreamReader(s.getInputStream()); 
            BufferedReader reader = new BufferedReader(stream);
            String message = reader.readLine(); 
            System.out.println(message); 
            reader.close();
        } catch(IOException ex) {
            ex.printStackTrace(); 
        }
    }
    
     public static void main(String[] args) {
        Client c = new Client();
        c.go();
    }
}


