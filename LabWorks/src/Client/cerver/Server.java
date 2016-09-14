/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.cerver;
import java.io.*;
import java.net.*;
/**
 *
 * @author stud_6
 */
public class Server {
    public void okey() {
        try { 
      ServerSocket serverSock = new ServerSocket(1333);
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
        s.okey();
}
}
