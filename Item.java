
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    //Implemented in your own way
     String name;
     boolean status;
     String description;
     String value;
}
    public Item(String name, boolean status, String description, String value){
    this.name = name;
    this.status = status;
    this.description = description;
    this.value = value;
}
public String getName(){
    return name;
}
public boolean status(){
    return status;
}
public String description(){
    return description;

}
public Item(){
    name = sky;
    description = "Makes awesome cool weapons";
    value = "Mythical";
}

