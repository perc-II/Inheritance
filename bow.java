
/**
 * Write a description of class bow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bow extends Weapon
{
    
    int arrows;
    int damage;
    
    public Bow( String name, String status, String description, int arrows, int damage){
        super(name, status, description, damage);
        this.arrows = 7;
        this.damage = damage;
    }

public int getArrows(){
    return arrows;
}

public void shootArrows(){
    if(arrows > 0){
        arrows--;
    }
}
    public int getDamage(){
    return damage;
        
    }

public void repairArrows(){
    arrows = 7;
}
    public boolean parry(){
        int randomNum = (int)(Math.random()*10+1);
        if(randomNum <= 5){

            return true;

        }
        return false;
    }

