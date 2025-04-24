
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
    
    public Bow( String name, boolean status, String description, int arrows, int damage){
        super(name, status, description, damage);
        this.arrows = arrows;
        this.damage = damage;
    }
     public bow(){
       super();
       weapon = "bow";
       arrows = 7;
       damage = 50;
     }
    
    public boolean parry(){
        int randomNum = (int)(Math.random()*10+1);
        if(randomNum <= 4){

            return true;

        }
        return false;
    }

