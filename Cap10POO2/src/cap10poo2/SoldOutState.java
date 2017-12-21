/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10poo2;

/**
 *
 * @author vitor
 */
public class SoldOutState implements State{
    
    GumballMachine gumballMachine;
    
    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertQuarter(){
        System.out.println("Sorry we`ve sold out");
    }
    
    @Override
    public void ejectQuarter(){
        System.out.println("You haven`t inserted a quarter yet");
    }
    
    @Override
    public void turnCrank(){
        System.out.println("You turned but there is no quarter");
    }
    
    @Override
    public void dispense(){
        System.out.println("Sorry, we`re sold out");
    }
    
    @Override
    public String toString(){
        return "SoldOutState";
    }
    
}
