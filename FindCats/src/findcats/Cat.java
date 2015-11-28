package findcats;

public class Cat { 
    
    int locationCells;
    
    public void setLocation(int locs) {
        locationCells = locs;
    }

    
    String name;
    int age;
    String colour;
    int numOfGuesses = 0;
    int nameRand;  
   
    public void meow(){
              
        System.out.println("Meow! You've found me!");
	
	if (numOfGuesses < 2) {
		System.out.println("Good job!");
	} else {
		System.out.println("Took too long!");
        }
    }
    
    public void playing() {
        
    }
    
    public void setName(){
        String[] catsNames = {"Milly", "Samhein", "Effy", "Brinje", "Delight"};
        nameRand = (int) (Math.random() * catsNames.length);
    }    
}
