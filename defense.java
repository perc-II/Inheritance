public abstract class Defense extends Item implements DefenseCommands
{
int durability;

public defense(String name, boolean status, String description, int durability){
super(name, status, description);
this.durability = durability;
}
public defense(){
super();
durability = 100;
}
}
