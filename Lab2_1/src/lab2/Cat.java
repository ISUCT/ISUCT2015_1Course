package lab2;

public class Cat extends Animal {
    public void voice() {
        int age = (int) (Math.random() * 7 + 1);
        if (age < 2) {
            System.out.println("I am " + age + " year old");
        } else {
            System.out.println("I am " + age + " years old");
        }
        if (age < 4) {
           System.out.println("Play with me!"); 
        } else {
           System.out.println("Get off!! I am busy!");  
           chaseMouse();
           eat();
        }
    }
}

    

    

    
