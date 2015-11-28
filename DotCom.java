/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stud_17
 */
public class DotCom {
private ArrayList<String> locationCells;
private String name;
    private String n;

    /**
     *
     * @param loc
     */
    public void setLocationCells(ArrayList<String> loc) {
}

    private static class ArrayList<T> {

        public ArrayList() {
        }

        private int indexOf(String userInput) {
            throw new UnsupportedOperationException("Not yet implemented");
        }

        private void remove(int index) {
            throw new UnsupportedOperationException("Not yet implemented");
        }

        private boolean isEmpty() {
            throw new UnsupportedOperationException("Not yet implemented");
        }
    }

    /**
     *
     * @param n
     */
    public void setName(String n) {
    name = n;
    
}
    
public String chekYourself(String userInput) {
    String result = "Мимо" ;
    int index = locationCells.indexOf(userInput) ;
    if (index >= 0) {
        locationCells.remove(index) ;
        
        if (locationCells.isEmpty()) {
            result = "Потопил" ;
            System.out.println("Ой! Вы потопили" + name + "  : ( ");
        } else {
            result = "Попал" ;
        } // Конец if
    } // Конец if
    return result;
    
} // Конец метода
} // Конец класса
        
    



