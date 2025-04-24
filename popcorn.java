
/**
 * Write a description of class popcorn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class popcorn extends consumable 
{
    int protection;
    int strength;
    int energyBoost;
    int speed;

public  popcorn(String name, boolean status, String description, int protection, int strength, int energyBoost, int speed){
    super(name, status, description, protection);
    this.protection = protection;
    this.strength = strenghth;
    this.energyBoost = energyBoost;
    this.speed = speed;
}
     public pizza(){
      super();
      consumable = "popcorn";
      protection = 100;
      strength = 70;
      energyBoost = 100;
      speed = 40;
    }
public boolean jumpBoost(){
    int randomNum = (int)Math.random()*10+1);
    if(randomNum  <= 9){
    return true;
}
return false;
}
