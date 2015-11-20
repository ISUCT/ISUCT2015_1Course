/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author stud_17
 */
public class Labworks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean logic = true; 
        System.out.println(logic) ;
        char charVar = 'a';
        System.out.println(charVar);
        byte b = 3;
        System.out.println(b);
        int g = 38;
        System.out.println(g);
        short s = 28902;
        System.out.println(s);
        long l = 37678;
        System.out.println(l);
        float f = 48;
        System.out.println(f);
        double d = 125;
        System.out.println(d);
   
    Book a = new Book();
    a.name = "Война и мир";
    a.pages = 2000;
    a.isReaded = false;
    a.author();
    //......
    
    
    Book[] books = new Book[3];
    books[0].name = "Этюд в багровых тонах";
    books[0].pages = 150;
    books[0].isReaded = true;
    
    books[1].name = "Граф Монте-Кристо";
    books[1].pages = 1200;
    books[1].isReaded = false;
    
    books[2].name = "Великий Гэтсби";
    books[2].pages = 450;
    books[2].isReaded = true;
    
    int i = 0;
    while(i<books.length){
        books[i].author();
        i=i+1;
        
    }
    }   
        
}
