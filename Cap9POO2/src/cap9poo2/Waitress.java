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
public class Waitress {
    Menu pancakeMenu;
    Menu dinerMenu;
    Menu cafeMenu;
    
    public Waitress(Menu pancakeMenu, Menu dinerMenu, Menu cafeMenu){
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }
    
    public void printMenu(){
        Iterator pancakeIterator = pancakeMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        
        System.out.println("\nDINNER");
        printMenu(cafeIterator);
        
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
