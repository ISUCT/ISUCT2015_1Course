/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.cerver;
import java.io.*;
import java.net.*;

public class Server {
    public void okey() {
        try { 
      ServerSocket serverSock = new ServerSocket(1333);
            while(true) {
                Socket s = serverSock.accept();
                ObjectOutputStream oOut = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream oIn = new ObjectInputStream(s.getInputStream());
                Config con = (Config) oIn.readObject();
                System.out.println ("Got it from client: \r\n" + "A = " + con.getA() + "\r\n" + "B = " + con.getB() + "\r\n" +"Xn = " + con.get() + "Xk = " + con.getXk() + "\r\n" + "Dx = " + con.getDx() + "\r\n");
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
