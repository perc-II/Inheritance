
/**
 * Write a description of class cookies here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cookies extends consumable
{
    int protection;
    int power;
    int speedBoost;

public  cookie(String name, boolean status, String description, int protection, int power, int speedBoost){
    super(name, status, description, protection);
    this.protection = protection;
    this.power = power;
    this.speedBoost = speedboost;
}
     public cookie(){
      super();
      consumable = "cookie";
      protection = 20;
      power = 10;
      speedBoost = 5;
     
    }
public boolean EnergyBoost(){
    int randomNum = (int)Math.random()*10+1);
    if(randomNum  <= 100){
    return true;
}
return false;
}
