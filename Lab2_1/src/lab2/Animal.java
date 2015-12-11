package lab2;

public class Animal {
    
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    int age = (int) (Math.random() * 7 + 1); 
    boolean voice;
    String name;
    boolean meow;
    
    
    public void setAge() {
        int Age = age;
    }
    
    public void setName() {
        String Name = name;
    }
       
    public void voice() { 
        if (age < 2) {
            System.out.println("I am " + age + " year old");
        } else {
            System.out.println("I am " + age + " years old");
        }
    }
    
    public void chaseMouse() {
        System.out.println("I am chasing a mouse");
    }
} 