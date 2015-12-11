package outworld;

public class Animal {
    
    Boolean isHungry;
    String name;
    String animal;

    public void voice() {
        System.out.println(animal + " shout:");
        System.out.println("'I am an animal'");
        System.out.println("My name is " + name);        
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void walkAround() {
        System.out.println(name + " is walking around and search the food");
    }

    public void living() {
        if (isHungry) {
            eat();
        } else {
            walkAround();
        }
    }

}