/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
/**
 *
 * @author stud_6
 */

    
public class Client {
    public void jButton1() {
        try {
            
            Socket s = new Socket("127.0.0.1", 1467); 
            TransferableObj tObj = new TransferableObj();
            tObj.setXn(1.25);
            tObj.setXk(3.25);
            tObj.setDx(0.4);
            
            System.out.println(tObj.getXn());
            System.out.println(tObj.getXk());
            System.out.println(tObj.getDx());
            

            ObjectOutputStream oOut = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream oIn = new ObjectInputStream(s.getInputStream());
            oOut.writeObject(tObj);
            
            TransferableObj iObj = (TransferableObj) oIn.readObject();
            System.out.println(iObj.getResult());
            oOut.close();
            oIn.close();

        } catch (IOException ex) {
            System.err.println(ex);
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
 public static void main(String[] args) {
        Client c = new Client();
        c.jButton1();
    
     }
}
    

            //InputStreamReader stream = new InputStreamReader(s.getInputStream()); 
            //BufferedReader reader = new BufferedReader(stream);
            //String message = reader.readLine(); 
            //System.out.println(message); 
            //reader.close();
        //} catch(IOException ex) {
          //  ex.printStackTrace(); 
        
    
    
     