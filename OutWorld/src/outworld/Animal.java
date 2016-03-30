package outworld;

abstract class Animal {
    
    Boolean isHungry;
    int[] year = {1,2,3,4,5,6,7,8,9};
    
    public void setAge(int age) {
        
    }
    
    
    public void setAge() {
       // int result == (int) Math.random()*year;
    }
 
    public void voice() {
        System.out.println(this.toString() + " shout:");
        System.out.println("'I am a " + hashCode() + "'");        
       // if (result<2) {
       //     System.out.println("'I am " + setAge() + " year old'");
       // }  else {
       //     System.out.println("'I am " + setAge() + " year old'");
       // }
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
    
    @Override
    public String toString() {
        return (hashCode() + "");
    }
    
    abstract void makeNoice();
}