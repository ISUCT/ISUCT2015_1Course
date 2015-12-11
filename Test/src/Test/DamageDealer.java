
package Test;

public class DamageDealer extends Hero{
    int DamagePoints;
    public DamageDealer(String name){
        Name = name;
        MaxHP = 5000;
        CurrentHP = MaxHP;
        DamagePoints = 200;
    }
    
    public @Override void WriteStat(){
        System.out.println(Name + " " + CurrentHP);
    }
    
    public void Attack(Hero atteckedHero){
        atteckedHero.CurrentHP = atteckedHero.CurrentHP - DamagePoints;
    }
}
