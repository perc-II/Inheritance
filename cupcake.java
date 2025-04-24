
/**
 * Write a description of class cupcake here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cupcake extends consumable
{
    int protection;
    int strength;
    int health;
    int invisbility;

public  cupcake(String name, boolean status, String description, int protection, int strength, int health){
    super(name, status, description, protection);
    this.protection = protection;
    this.strength = strenghth;
    this.health = health;
    this.invibilty = invisbility;
    
}
     public pizza(){
      super();
      consumable = "cupcake";
      protection = 100000000;
      strength = 100000000;
      health = 10000000000;
      invisbilty = 100;
     
    }
public boolean regeneration(){
    int randomNum = (int)Math.random()*10+1);
    if(randomNum  <= 100000000000000000){
    return true;
}
return false;
}
