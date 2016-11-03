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
            
            Config con = new Config();
            con.setText("Seted on client");
            con.setA(0.05);
            con.setB(0.06);
            con.setXn(0.2);
            con.setXk(0.95);
            con.setDx(0.15);
            
            System.out.println("Have it on client: \r\n" + "A = " + con.getA() + "\r\n" + "B = " + con.getB() + "\r\n" + "Xn = " + con.getXn() + "\r\n" + "Xk = " + con.getXk() + "\r\n" + "Dx = " + con.getDx() + "\r\n");

            ObjectOutputStream oOut = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream oIn = new ObjectInputStream(clientSocket.getInputStream());
            oOut.writeObject(con);

            Config conf = (Config) oIn.readObject();
            System.out.println(con.getText());
            System.out.println(con.getA());
            System.out.println(con.getB());

            oOut.close();
            oIn.close();

        } catch (IOException ex) {
            System.err.println(ex);
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Client client = new Client();
        client.go();
    }
}