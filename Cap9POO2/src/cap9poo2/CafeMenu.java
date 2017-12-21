/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9poo2;
import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author vitor
 */
public class CafeMenu implements Menu{
    
    Hashtable menuItems = new Hashtable();
    
    public CafeMenu(){
        
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun", true, 3.99);
        
        addItem("Soup of the day", "A cup of soup of the day, with a side of salad", false, 3.69);
        
        addItem("Burrito", "A large burrito, with whole pinto beans", true, 4.29);
        
    }
    
    private void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }
    
    public Hashtable getItems(){
        return menuItems;
    }
    
    @Override
    public Iterator createIterator(){
        return menuItems.values().iterator();
    }
    
}
