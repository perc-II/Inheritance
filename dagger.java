
/**
 * Write a description of class dagger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dagger extends Weapon
{
    int damage;
    int range;
    int durability;

public dagger(String name, String status, String description, int damage, int range, int durability){
    super(name, status, description, damage);
    this.damage = damage;
    this.range = range;
    this.durability = durability;
}

public int getDamage(){
    return damage;

}

public int getRange(){
    return range;
}

public int getDurability(){
    return durability;
}

public boolean poisonedAttack(){
    int randomNum = (int)Math.random()*10+1);
    if(randomNum  <= 8){
    System.out.println("Targets has been poisoned");

    return true;
}
return false;
}
    
