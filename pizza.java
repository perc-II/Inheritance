
/**
 * Write a description of class pizza here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pizza extends consumable
{
    int protection;
    int strength;
    int energyBoost;

public  pizza(String name, boolean status, String description, int protection, int strength, int energyBoost){
    super(name, status, description, protection);
    this.protection = protection;
    this.strength = strenghth;
    this.energyBoost = energyBoost;
}
     public pizza(){
      super();
      consumable = "pizza";
      protection = 45;
      strength = 60;
      energyBoost = 80;
     
    }
public boolean speed(){
    int randomNum = (int)Math.random()*10+1);
    if(randomNum  <= 60){
    return true;
}
return false;
}
