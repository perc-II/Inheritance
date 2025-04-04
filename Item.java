
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
     double price;
    public Item(String name, boolean status, String description, double price){
    this.name = name;
    this.status = status;
    this.description = description;
    this.price = price;
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
public double price(){
    return price;
}
}