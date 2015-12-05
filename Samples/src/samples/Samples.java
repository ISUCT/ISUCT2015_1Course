package samples;

import java.util.*;

public class Samples {

    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Right", 1);
        scores.put("Left", 2);
        
        System.out.println(scores.get("Left"));
        
        System.out.println(scores.get("Right"));
        
    }
}
