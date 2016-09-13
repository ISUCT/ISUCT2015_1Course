/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
   import java.io.*;
import java.net.*;

/**
 *
 * @author Елена
 */
public class Youneedtolistenme {

    public static void main(String[] ar) {
        int port = 3333;
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Waiting for you...");
            Socket socket = ss.accept();
            System.out.println("Got a client");
            System.out.println();

            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            String line = null;
            while (true) {
                line = in.readUTF();
                System.out.println("I need to tell you something important: " + line);
                System.out.println("Are you okay?");
                out.writeUTF(line);
                out.flush();
                System.out.println("Waiting for the next important speech...");
                System.out.println();
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}

