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
        boolean logic = true; //false
        char charVar = 'a';
        byte b = 12;
        System.out.println(logic);
        System.out.println(charVar);
        System.out.println(b);
//           short        
//           int        
//           long
//           float
//           double
        
        Mouse a = new Mouse();
        a.name = "Микки";
        a.age = 1;
        a.isAngry = true;
        a.voice();
        
        Mouse[] mouses = new Mouse[3];
        mouses[0] = new Mouse();
        mouses[0].name = "Миуф";
        mouses[0].age = 2;
        mouses[0].isAngry = false;
       
        mouses[1] = new Mouse();
        mouses[1].name = "Джек";
        mouses[1].age = 1;
        mouses[1].isAngry = false;
        
        mouses[2] = new Mouse();
        mouses[2].name = "Джон";
        mouses[2].age = 1;
        mouses[2].isAngry = true;
        
        int i = 0;
        while(i<mouses.length){
            mouses[i].voice();
            i=i+1;
        }
        
        
        
        
    }
}
