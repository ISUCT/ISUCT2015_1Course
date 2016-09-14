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
public class ServerSample {

    public void go(){
        try{
            ServerSocket serverSocket = new ServerSocket(5000);
            while(true){
                Socket socket = serverSocket.accept();
                ObjectOutputStream oOut = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream oIn = new ObjectInputStream(socket.getInputStream());
                TransferableObj iObj = (TransferableObj)oIn.readObject();
                System.out.println(iObj.getText());
                System.out.println(iObj.getA());
                System.out.println(iObj.getB());
                iObj.setText("Modified on server");
                iObj.setA(iObj.getA()+1);
                iObj.setB(iObj.getB()+1);
                oOut.writeObject(iObj);
                
                oOut.close();
                oIn.close();
            }
        }catch(IOException ex){
            System.err.println(ex);
        }catch(Exception ex){
            System.err.println(ex);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServerSample server = new ServerSample();
        server.go();
    }
    
}
