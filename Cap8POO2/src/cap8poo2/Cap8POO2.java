/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap8poo2;

/**
 *
 * @author vitor
 */
public class Cap8POO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CaffeineBeverage myTea = new Tea();
        CaffeineBeverage myCoffee = new Coffee();
        
        myTea.prepareBeverage();
        
        myCoffee.prepareBeverage();
    }
    
}
