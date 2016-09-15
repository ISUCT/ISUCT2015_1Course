/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proga;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author UI
 */
public class Server {
    public void jButton() {
        try {
             ServerSocket serverSocket = new ServerSocket(1818);
            while(true){
                Socket s = serverSocket.accept();
                ObjectOutputStream oOut = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream oIn = new ObjectInputStream(s.getInputStream());
                TransferableObj iObj = (TransferableObj)oIn.readObject();
                System.out.println(iObj.getXn());
                System.out.println(iObj.getA());
                System.out.println(iObj.getB());
                System.out.println(iObj.getXk());
                System.out.println(iObj.getDx());
                
                 Calculator instance = new Calculator();
        //iObj.setResult instance.TaskA(xn, xk, dx, a, b);
       
                
                iObj.setXn (iObj.getXn()+1);
                iObj.setDx (iObj.getDx()+1);
                iObj.setXk (iObj.getXk()+1);
                iObj.setA(iObj.getA()+1);
                iObj.setB(iObj.getB()+1);
                oOut.writeObject(iObj);
               // iObj.setXn (iObj.getXn() +1);
                //iObj.setDx
                
                oOut.close();
                oIn.close();
            }
        }catch(IOException ex){
            System.err.println(ex);
        }catch(Exception ex){
            System.err.println(ex);
        }
}
            //ServerSocket serverSock = new ServerSocket(1818);
          //  while(true) {
             //   Socket s = serverSock.accept();
             //   PrintWriter writer = new PrintWriter(s.getOutputStream()); 
             //   writer.println("Have a nice day today! We've got a server now, You're Welcome"); 
             //   writer.close(); 
            
     //   } catch(IOException ex) {
          //  ex.printStackTrace(); 
        
    
    
     public static void main(String[] args) {
        Server s = new Server(); 
        s.jButton();
    }
}


