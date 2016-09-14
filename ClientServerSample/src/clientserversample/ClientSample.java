/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserversample;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author jskonst
 */
public class ClientSample {

    public void go() {
        try {
            Socket clientSocket = new Socket("127.0.0.1", 5000);
            TransferableObj tObj = new TransferableObj();
            tObj.setText("Seted on client");
            tObj.setA(1);
            tObj.setB(5.0);
            System.out.println(tObj.getText());
            System.out.println(tObj.getA());
            System.out.println(tObj.getB());

            ObjectOutputStream oOut = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream oIn = new ObjectInputStream(clientSocket.getInputStream());
            oOut.writeObject(tObj);
            
            TransferableObj iObj = (TransferableObj) oIn.readObject();
            System.out.println(iObj.getText());
            System.out.println(iObj.getA());
            System.out.println(iObj.getB());
            
            oOut.close();
            oIn.close();

        } catch (IOException ex) {
            System.err.println(ex);
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClientSample client = new ClientSample();
        client.go();
    }
}
