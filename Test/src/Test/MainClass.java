
package Test;

public class MainClass {
    
    public static void main(String[] args) {
        
        Healer Malfurion = new Healer("Malfurion");
        DamageDealer Axe = new DamageDealer("Axe");
        
        Healer Lili = new Healer("Lili");
        DamageDealer SarahKerrigan = new DamageDealer("Sarah Kerrigan");
        
        System.out.println("The battle begins!");
        
        Malfurion.WriteStat();
        Axe.WriteStat();
        Lili.WriteStat();
        SarahKerrigan.WriteStat();
        
        System.out.println("Axe is attacking Lili!");
        Axe.Attack(Lili);
        Lili.ShowReceivedDamage();
        
        System.out.println("Lili is healing herself!");
        Lili.Heal(Lili);
        Lili.WriteStat();
        
    }
}
