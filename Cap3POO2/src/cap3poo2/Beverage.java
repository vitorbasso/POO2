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
public abstract class Beverage {
    String description = "Unknow Beverage\n";
    
    public String getDescription(){
        return description;
    }
    
    public abstract double cost();
}
