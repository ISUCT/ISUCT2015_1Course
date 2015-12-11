package outworld;

public class OutWorld {
   

    public static void main(String[] args) {
        Animal a = new Dog();
        a.animal = "Dog";
        a.name = "Samhein";
        a.voice();
        a.isHungry = true;
        a.living();
        System.out.println(" ");        


        Animal b = new Penguin();
        b.animal = "Penguin";
        b.name = "Lilliat";
        b.voice();
        b.isHungry = false;
        b.living();
        System.out.println(" ");
        
        Animal c = new Dog();
        c.animal = "Dog";
        a.name = "Carel";
        a.voice();
        a.isHungry = false;
        a.living();
        System.out.println(" ");

    }
}
