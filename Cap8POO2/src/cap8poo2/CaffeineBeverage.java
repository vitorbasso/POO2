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
public abstract class CaffeineBeverage {
    
    final public void prepareBeverage(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    
    public void boilWater(){
        System.out.println("Boiling Water");
    }
    
    public abstract void brew();
    
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
    
    public abstract void addCondiments();
    
}
