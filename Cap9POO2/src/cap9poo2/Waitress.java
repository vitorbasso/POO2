/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9poo2;

/**
 *
 * @author vitor
 */
public class Waitress {
    PancakeHouseMenu pancakeMenu;
    DinerMenu dinerMenu;
    
    public Waitress(PancakeHouseMenu pancakeMenu, DinerMenu dinerMenu){
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = dinerMenu;
    }
    
    public void printMenu(){
        Iterator pancakeIterator = pancakeMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        
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
