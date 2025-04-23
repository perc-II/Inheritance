
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public class Item implements ItemInterface{
    //Implemented in your own way
     String name;
     boolean status;
     String description;
}
    public Item(String name, boolean status, String description){
    this.name = name;
    this.status = status;
    this.description = description;
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
}
