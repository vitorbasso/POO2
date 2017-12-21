/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap92poo2;

/**
 *
 * @author vitor
 */
public class MenuItem extends MenuComponent{
    
    String name;
    String description;
    boolean vegetarian;
    double price;
    
    public MenuItem(String name, String description, boolean vegetarian, double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    
    @Override
    public String getDescription(){
        return this.description;
    }
    
    @Override
    public boolean isVegetarian(){
        return this.vegetarian;
    }
    
    @Override
    public double getPrice(){
        return this.price;
    }
    
    @Override
    public void print(){
        System.out.print(" " + getName());
        if(isVegetarian()){
            System.out.print(" (v) ");
        }
        System.out.println(", " + getPrice());
        System.out.println("-- " + getDescription());
    }
    
}
