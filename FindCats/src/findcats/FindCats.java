package findcats;

public class FindCats {
    
    public static void main(String[] args) {
    
    Cat[] cats = new Cat[3];  
    
    cats[0] = new Cat();
    
    cats[1] = new Cat();
    
    cats[2] = new Cat();
    
    int i = 0; 
        while(i < cats.length){
            cats[i].setName();
            cats[i].meow();
            i=i+1;
        }
    }
}
