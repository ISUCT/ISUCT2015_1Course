/*
<<<<<<< HEAD
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;
=======
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

>>>>>>> ea5c3276aa15402def7682ec0820fefb2698994b
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
<<<<<<< HEAD

/**
 *
 * @author UI
 */
public class Client {
    public void jButton1() {
        try{
            Socket s = new Socket("127.0.0.1.",1450);
            
        }
    }
    
=======
/**
 *
 * @author stud_6
 */
public class Client {
    public void jButton1() {
        try {
            Socket s = new Socket("127.0.0.1", 1455); 
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
    
>>>>>>> ea5c3276aa15402def7682ec0820fefb2698994b
}
