
/**
 * Write a description of class soda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class soda extends consumable
{
    int protection;
    int strength;
    int energyBoost;
    int hydration;

public soda(String name, boolean status, String description, int protection, int strength, int energyBoost, int hydration){
    super(name, status, description, protection);
    this.protection = protection;
    this.strength = strenghth;
    this.energyBoost = energyBoost;
    this.hydration = hydration;
}
     public soda(){
      super();
      consumable = "soda";
      protection = 20;
      strength = 30;
      energyBoost = 95;
      hydration = 75;
     
    }
public boolean hydrationRestoration(){
    int randomNum = (int)Math.random()*10+1);
    if(randomNum  <= 65){
    return true;
}
return false;
}
