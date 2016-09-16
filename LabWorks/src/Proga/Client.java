/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proga;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author UI
 */
public class Client {
    public void jButton() {
        try {
            Socket clientSocket = new Socket("127.0.0.1", 1818);
            TransferableObj tObj = new TransferableObj();
            //tObj.setText("Seted on client");
            tObj.setA(2.0);
            tObj.setB(3.0);
            tObj.setXn(0.11);
            tObj.setXk(0.36);
            tObj.setDx(0.05);
            System.out.println(tObj.getXn());
            System.out.println(tObj.getA());
            System.out.println(tObj.getB());
            System.out.println(tObj.getXk());
            System.out.println(tObj.getDx());

            ObjectOutputStream oOut = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream oIn = new ObjectInputStream(clientSocket.getInputStream());
            oOut.writeObject(tObj);
            
            TransferableObj iObj = (TransferableObj) oIn.readObject();
//            System.out.println(iObj.getXn());
//            System.out.println(iObj.getA());
//            System.out.println(iObj.getB());
//             System.out.println(iObj.getXk());
//              System.out.println(iObj.getDx());
              System.out.println(iObj.getResult());
            
            oOut.close();
            oIn.close();

        } catch (IOException ex) {
            System.err.println(ex);
        } catch (Exception ex) {
            System.err.println(ex);
        }
}
            //Socket s = new Socket("127.0.0.1", 1818); 
           // InputStreamReader stream = new InputStreamReader(s.getInputStream()); 
           // BufferedReader reader = new BufferedReader(stream);
            //String message = reader.readLine(); 
           // System.out.println(message); 
           // reader.close();
     //   } catch(IOException ex) {
           // ex.printStackTrace(); 
        
    
    
     public static void main(String[] args) {
 Client c = new Client();
 c.jButton();
        //Client c = new Client();
       // c.jButton();
    
     }
}

