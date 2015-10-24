 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labworks;

/**
 *
 * @author stud_17
 */
public class LabWorks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean logic = true;
        System.out.println (logic);
        char charVar = 'a';
        System.out.println(charVar);
        byte someByte = 12;
        System.out.println (someByte);
        short someShort = 7;
        System.out.println (someShort);
        int someInt = 17;
        System.out.println (someInt);
        long someLong = 10;
        System.out.println (someLong);
        float someFloat = 11;
        System.out.println (someFloat);
        double someDouble = 5;
        System.out.println (someDouble);
        
        Book a = new Book();
        a.name = "Без надежды";
        a.pages = 500;
        a.read = false;
        a.author();
        //......
        
        
        Book[] books = new Book[3];
        
        books[0] = new Book();
        books[0].name ="Сотников";
        books[0].pages =220;
        books[0].read = true;
        
        books[1] = new Book();
        books[1].name = "В окопах Сталинграда";
        books[1].pages = 670;
        books[1].read = true;
        
        books[2] = new Book();
        books[2].name = "Капитанская дочка";
        books[2].pages = 400;
        books[2].read = false;
        
        int i =0;
        while(i<books.length){
            books[i].author();
            i=i+1;
            
        }
    }
}
