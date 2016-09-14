/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author stud_6
 */
public class Client {
    public void jButton1() {
        try {
            Socket s = new Socket("127.0.0.1", 1512); 
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
        c.jButton1();
    }
     
}
