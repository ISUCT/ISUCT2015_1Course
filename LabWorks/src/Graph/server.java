/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author stud_6
 */
public class Server {

    public void jButton1() {
        try {
            ServerSocket serverSocket = new ServerSocket(5455);
            while (true) {
                Socket s = serverSocket.accept();
                ObjectOutputStream oOut = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream oIn = new ObjectInputStream(s.getInputStream());
                TransferableObj iObj = (TransferableObj) oIn.readObject();
                System.out.println(iObj.getXn());
                System.out.println(iObj.getA());
                System.out.println(iObj.getB());
                System.out.println(iObj.getXk());
                System.out.println(iObj.getDx());

                Calculator instance = new Calculator();

                iObj.setXn(iObj.getXn() + 1);
                iObj.setDx(iObj.getDx() + 1);
                iObj.setXk(iObj.getXk() + 1);
                iObj.setA(iObj.getA() + 1);
                iObj.setB(iObj.getB() + 1);

                oOut.close();
                oIn.close();
            }
        } catch (IOException ex) {
            System.err.println(ex);
        } catch (Exception ex) {
            System.err.println(ex);
        }

    }

    public static void main(String[] args) {
        Server s = new Server();
        s.jButton1();
    }
}