package client.server;

import java.io.*;
import java.net.*;

public class Server {
    
    String[] adviceList = {"Ешьте меньшими порциями", "Купите облегающие джинсы. Нет, они не делают вас полнее.", "Два слова: не годится", "Будьте честны хотя бы сегодня. Скажите своему начальнику все, что вы *на самом деле* о нем думаете.", "Возможно, вам стоит подобрать другую прическу."}; 


    
    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(1818);
            while(true) {
                Socket sock = serverSock.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream()); 
                String advice = getAdvice();
                writer.println(advice); 
                writer.close(); 
                System.out.println(advice);
            }


        } catch(IOException ex) {
            ex.printStackTrace(); 
        }
        
    }
           private String getAdvice() {    
                int random = (int) (Math.random() * adviceList.length); 
                return adviceList[random]; 
            } 
            
        public static void main(String[] args) {
        Server server = new Server(); 
        server.go();
    }
} 