/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author UI
 */
public class Serv {

    public void okey() {
        try {
            ServerSocket serverSocket = new ServerSocket(1333);
            while (true) {
                Socket socket = serverSocket.accept();
                ObjectOutputStream oOut = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream oIn = new ObjectInputStream(socket.getInputStream());
                TransferableObj iObj = (TransferableObj) oIn.readObject();
                System.out.println(iObj.getXn());
                System.out.println(iObj.getXk());
                System.out.println(iObj.getDx());
                System.out.println(iObj.getA());

                Calculator instance = new Calculator();
                iObj.setResult(instance.TakA(iObj.getXn(), iObj.getXk(), iObj.getDx(), iObj.getA()));

                iObj.setXn(iObj.getXn() + 1);
                iObj.setXk(iObj.getXk() + 1);
                iObj.setDx(iObj.getDx() + 1);
                iObj.setA(iObj.getA() + 1);

                oOut.writeObject(iObj);

                oOut.close();
                oIn.close();
            }
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
        Serv server = new Serv();
        server.okey();

    }
}
//   ServerSocket serverSock = new ServerSocket(1333);
//        while(true) {
//           Socket s = serverSock.accept();
//           PrintWriter writer = new PrintWriter(s.getOutputStream()); 
//            writer.println("Have a nice day today! We've got a server now, You're Welcome"); 
//           writer.close(); 
//       }
//   } catch(IOException ex) {
//      ex.printStackTrace(); 
//  }
//  }
//  public static void main(String[] args) {
//     Serv s = new Serv(); 
//     s.okey();
// }
//}      

