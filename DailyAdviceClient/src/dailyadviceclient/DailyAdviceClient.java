package dailyadviceclient;

import java.io.*;
import java.net.*;

public class DailyAdviceClient {
    
    public void go() {
        try {
            Socket s = new Socket("192.168.0.103", 5000);
            
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            String adviсe = reader.readLine();
            System.out.println("Today you should: " + adviсe);
            reader.close();
        } catch(IOException ex) {
            ex.printStackTrace(); 
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
    
}
