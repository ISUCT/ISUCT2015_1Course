/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.cerver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author stud_6
 */
public class Client {

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
//public void okey() {
//     try {
//          Socket s = new Socket("127.0.0.1", 1333); 
//         InputStreamReader stream = new InputStreamReader(s.getInputStream()); 
//         BufferedReader reader = new BufferedReader(stream);
//         String message = reader.readLine(); 
//         System.out.println(message); 
//         reader.close();
//      } catch(IOException ex) {
//          ex.printStackTrace(); 
//     }
// }
// 
//  public static void main(String[] args) {
//     Client c = new Client();
//     c.okey();
//} }