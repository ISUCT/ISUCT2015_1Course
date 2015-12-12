package outworld;

public class Penguin extends Animal {
    
    public void makeNoice() {
        System.out.println("Quack");
    }
    
    @Override
    public String toString() {
        return "I am a Penguin";
    }
}
