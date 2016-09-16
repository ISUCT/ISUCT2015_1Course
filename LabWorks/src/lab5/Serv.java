/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.*;
import java.net.*;

/**
 *
 * @author stud_5
 */
public class Serv {

    public void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            while (true) {
                Socket s = serverSocket.accept();
                ObjectOutputStream oOut = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream oIn = new ObjectInputStream(s.getInputStream());
                Lol lol = (Lol) oIn.readObject();
                System.out.println("Got it from client: \r\n" + "A = " + lol.getA() + "\r\n" + "B = " + lol.getB() + "\r\n" + "Xn = " + lol.getXn() + "\r\n" + "Xk = " + lol.getXk() + "\r\n" + "Dx = " + lol.getDx() + "\r\n");
                Plushka calc = new Plushka();
                lol.setResult(calc.Pachka(lol.getXn(), lol.getXk(), lol.getDx(), lol.getA(), lol.getB()));
                oOut.writeObject(lol);
                oOut.close();
                oIn.close();
               
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Serv s = new Serv();
        s.go();
    }

}
