/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9poo2;
import java.util.Iterator;

/**
 *
 * @author vitor
 */
public class DinerMenu implements Menu{
    
    static final int MAX_ITEMS = 6;
    
    int numberOfItems = 0;
    
    MenuItem[] menuItems;
    
    public DinerMenu(){
        
        menuItems = new MenuItem[MAX_ITEMS];
        
        addItem("Vegetarian BLT", "faking Bacon with lettuce & tomato on whole wheat", true, 2.99);
        
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        
        addItem("HotDog", "A hot dog with saurkraut, relish, onions, topped with cheese", false, 3.05);
        
    }
    
    private void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS){
            System.out.println("Sorry, menu is full! can`t add item to menu!");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }
    
    public MenuItem[] getMenuItems(){
        return this.menuItems;
    }
    
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
    
}
