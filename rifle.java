
/**
 * Write a description of class rifle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rifle extends Weapon
{
    int damage;
    int range;
    int durability;
    int caliber;

public rifle(String name, boolean status, String description, int damage, int range, int durability, int caliber){
    super(name, status, description, damage);
    this.damage = damage;
    this.range = range;
    this.durability = durability;
    this.cailber = caliber;
}
    public rifle(){
       super();
       weapon = "rifle";
       damage = 60;
       range = 75;
       durability = 87;
       caliber = 10;
    }
public boolean RiflePopSpin(){
    int randomNum = (int)Math.random()*10+1);
    if(randomNum  <= 8){
    System.out.println("Targets has been poisoned");

    return true;
}
return false;
}

    
