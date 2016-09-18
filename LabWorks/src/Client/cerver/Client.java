/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.cerver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class Client {

    public void go() {
        try {
            Socket clientSocket = new Socket("127.0.0.1", 5000);
            
            Config con = new Config();
            con.setText("Seted on client");
            con.setA(1.3);
            con.setB(5.0);
            con.setXn (0.55);
            con.setXk (1.5);
            con.setDx(0.3);
            
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Client client = new Client();
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