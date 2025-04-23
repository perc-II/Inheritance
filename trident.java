
/**
 * Write a description of class trident here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class trident extends Weapon
{
    int damage;
    int range;
    int durability;
    
public trident(String name, String status, String description, int damage, int range, int durability){
    super(name, status, description, damage);
    this. damage = damage;
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
    public void waveCrash(){
        targetHealth -= 100;
    }
}
