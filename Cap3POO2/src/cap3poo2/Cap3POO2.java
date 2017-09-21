/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3poo2;

/**
 *
 * @author vitor
 */
public class Cap3POO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        
    }
    
}
