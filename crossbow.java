
/**
 * Write a description of class crossbow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class crossbow extends Weapon
{
    int damage;
    int range;
    int arrows;
    int durability

public rifle(String name, boolean status, String description, int damage, int range, int durability, int arrows){
    super(name, status, description, damage);
    this.damage = damage;
    this.range = range;
    this.arrows = arrows;
    this.durability = durability;
}
     public crossbow(){
       super();
       weapon = "cross bow";
       damage = 95;
       range = 70;
       durability = 80;
       arrows = 5;
    }
public boolean multi-shot(){
    int randomNum = (int)Math.random()*10+1);
    if(randomNum  <= 10){
    return true;
}
return false;
}
