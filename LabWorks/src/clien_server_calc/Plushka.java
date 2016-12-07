
package clien_server_calc;
import java.util.ArrayList;


public class Plushka {

    public static void main(String[] args) {
    }

    public double y(double x, double b, double a) {
        double y = (Math.pow(a, x) - Math.pow(b, x)) / (Math.log10(a/b)) * (Math.pow((a*b), (1/3)));
return y;
    }
public ArrayList<Double> Pachka(double xn, double xk, double dx, double a, double b) {
 ArrayList<Double> y = new ArrayList<Double>(); 
 for (double x = xn; x <= xk; x = x + dx){
      y.add(y(x, a, b));
 }
 return y;
 
}

public ArrayList<Double> Duck(ArrayList<Double> x, double a, double b) {
ArrayList<Double> y = new ArrayList<Double>(); 
for (double i : x) {
    y.add(y(i, a, b));
}
return y;
}
}