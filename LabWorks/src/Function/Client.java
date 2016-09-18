/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
/**
 *
 * @author Ирина
 */
public class Client {
    public void go() {
        try {
            Socket clientSocket = new Socket("127.0.0.1", 5000);
            Config tObj = new Config();
            tObj.setText("Seted on client");
            tObj.setA(1);
            tObj.setB(5.0);
            System.out.println(tObj.getText());
            System.out.println(tObj.getA());
            System.out.println(tObj.getB());

            ObjectOutputStream oOut = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream oIn = new ObjectInputStream(clientSocket.getInputStream());
            oOut.writeObject(tObj);

            Config iObj = (Config) oIn.readObject();
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
}

