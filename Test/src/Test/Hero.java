
package Test;

public abstract class Hero {
    String Name;
    int MaxHP;
    int CurrentHP;
    
    public void ShowReceivedDamage(){
        System.out.println(Name + " lost " + (MaxHP - CurrentHP) + " HP.");
    }
    
    public abstract void WriteStat();
}
    