/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9poo2;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author vitor
 */
public class PancakeHouseMenu implements Menu{
    
    ArrayList<MenuItem> menuItems;
    
    public PancakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();
        
        addItem("K&B`s pancake breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
        
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs and sausage", false, 2.49);
        
        addItem("BlueBerry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        
        addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59);
        
        
    }
    
    private void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    
    public ArrayList<MenuItem> getMenuItems(){
        return this.menuItems;
    }
    
    public Iterator createIterator(){
        return menuItems.iterator();
    }
    
}
