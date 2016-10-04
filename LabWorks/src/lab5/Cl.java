/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author stud_5
 */
public class Cl {
    
     public void go() {
        try {
            Socket s = new Socket("192.168.12.205", 6666); 
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
        Cl c = new Cl();
        c.go();
    }
}

