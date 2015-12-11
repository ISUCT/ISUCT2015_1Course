package outworld;

abstract class Animal {
    
    Boolean isHungry;

    public void voice() {
        System.out.println(getClass() + " shout:");
        System.out.println("'I am the " + hashCode() + "'");        
    }

    public void eat() {
        System.out.println(hashCode() + " is eating");
    }

    public void walkAround() {
        System.out.println(hashCode() + " is walking around and searching for the food");
        makeNoice();
    }

    public void living() {
        if (isHungry) {
            eat();
        } else {
            walkAround();
        }
    }
    
    abstract void makeNoice();
}