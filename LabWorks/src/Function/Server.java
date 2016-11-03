/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;
import java.io.*;
import java.net.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author Ирина
 */
public class Server {
    public void okey() {
        try { 
      ServerSocket serverSock = new ServerSocket(1333);
            while(true) {
                Socket s = serverSock.accept();
                ObjectOutputStream oOut = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream oIn = new ObjectInputStream(s.getInputStream());
                Config con = (Config) oIn.readObject();
                System.out.println ("Got it from client: \r\n" + "A = " + con.getA() + "\r\n" + "B = " + con.getB() + "\r\n" +"Xn = " + con.getXn() + "Xk = " + con.getXk() + "\r\n" + "Dx = " + con.getDx() + "\r\n");
                
                Calculator calc = new Calculator();
                con.setResult(calc.TaskA(con.getXn(), con.getXk(), con.getDx(), con.getA(), con.getB()));
                oOut.writeObject(con);
                oOut.close();
                oIn.close();
                
            }
        } catch(Exception ex) {
            ex.printStackTrace(); 
        }
    }
    
     public static void main(String[] args) {
        Server s = new Server(); 
        s.okey();
}
}