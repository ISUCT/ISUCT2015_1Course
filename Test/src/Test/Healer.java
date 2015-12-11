
package Test;

public class Healer extends Hero{
    int HealPoints;
    public Healer(String name){
        Name = name;
        MaxHP = 3000;
        CurrentHP = MaxHP;
        HealPoints = 200;
    }
    
    public void Heal(Hero healingHero){
        healingHero.CurrentHP = healingHero.CurrentHP + HealPoints;
    }
    
    public @Override void WriteStat(){
        System.out.println(Name + " " + CurrentHP);
    }
}
