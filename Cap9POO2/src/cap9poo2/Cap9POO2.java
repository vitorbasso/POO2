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
public class Cap9POO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();
        
        
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        
        waitress.printMenu();
        
    }
    
}
