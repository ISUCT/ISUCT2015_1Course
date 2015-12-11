package outworld;

public class OutWorld {

    public static void main(String[] args) {
Animal a = new Dog();
 a.voice();
a.isHungry = true;
a.eat();
a.animal = "Dog";

Animal b = new Penguin();
b.voice();
b.isHungry = false;

    }
}
