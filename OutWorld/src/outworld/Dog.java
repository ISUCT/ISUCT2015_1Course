package outworld;

public class Dog extends Canine {
    public void makeNoice() {
        System.out.println("Woof");
    }
    
    @Override
    public String toString() {
        return "I am a Dog ";
    }
}
