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
public class Coffee extends CaffeineBeverage{
    
    @Override
    public void brew(){
        System.out.println("Dripping coffee through filter");
    }
    
    @Override
    public void addCondiments(){
        System.out.println("Adding sugar and milk");
    }
    
}
