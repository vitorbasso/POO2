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
public class Waitress {
    
    ArrayList<Menu> menus;
    
    public Waitress(ArrayList<Menu> menus){
        this.menus = menus;
    }
    
    public void printMenu(){
        
        Iterator menusIterator= menus.iterator();
        
        while(menusIterator.hasNext()){
            Menu menu = (Menu) menusIterator.next();
            printMenu(menu.createIterator());
        }
        
    }
    
    private void printMenu(Iterator iterator){
        MenuItem menuItem;
        while(iterator.hasNext()){
            menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
