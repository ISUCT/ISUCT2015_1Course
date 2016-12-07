/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author UI
 */
public class Regexnew {
    public static boolean testPassport(String passport){
Pattern p = Pattern.compile("(\\d{2})\\s*(\\d{2})\\D*(\\d{6})(\\D*)$");
Matcher m = p.matcher(passport);
boolean b = m.matches();
return b;
}
    
}
