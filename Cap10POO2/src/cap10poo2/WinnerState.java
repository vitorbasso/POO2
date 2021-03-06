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
public class WinnerState implements State{
    
    GumballMachine gumballMachine;
    
    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertQuarter(){
        System.out.println("Please wait, we`re already giving you a gumball");
    }
    
    @Override
    public void ejectQuarter(){
        System.out.println("Sorry, you already turned the crank");
    }
    
    @Override
    public void turnCrank(){
        System.out.println("Turning twice doesn`t get you another gumball");
    }
    
    @Override
    public void dispense(){
        System.out.println("YOU`RE A WINNER! You get two gumballs for your quarter!");
        if(gumballMachine.getCount() <= 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0){
                gumballMachine.releaseBall();
                if(gumballMachine.getCount() > 0){
                    gumballMachine.setState(gumballMachine.getNoQuarterState());
                }else{
                    gumballMachine.setState(gumballMachine.getSoldOutState());
                }
            }else{
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
    
    @Override
    public String toString(){
        return "WinnerState";
    }
    
}
