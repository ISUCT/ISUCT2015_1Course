/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledotcom;

/**
 *
 * @author anastasia
 */
import java.io.*;

/**
 *
 * @author anastasia
 */
public class GameHelper {

    /**
     *
     * @param promt
     * @return
     */
    public String getUserInput(String promt) {
        String inputLine = null;
        System.out.print(promt + " ");
        try {
            BufferedReader is = new BufferedReader (
            new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException : " + e);
        }
        
        return inputLine;
    }
}
