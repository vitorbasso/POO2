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
public class MenuItem {
    
    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;
    
    public MenuItem (String name, String description, boolean vegetarian, double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public boolean isVegetarian(){
        return this.vegetarian;
    }
    
    public double getPrice(){
        return this.price;
    }
    
}
