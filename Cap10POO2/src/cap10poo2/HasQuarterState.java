/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10poo2;
import java.util.Random;

/**
 *
 * @author vitor
 */
public class HasQuarterState implements State{
    
    GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());
    
    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertQuarter(){
        System.out.println("You can`t insert another quarter!");
    }
    
    @Override
    public void ejectQuarter(){
        System.out.println("Quarter Returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    
    @Override
    public void turnCrank(){
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if((winner == 2) && gumballMachine.getCount() > 1){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
        
        gumballMachine.getState().dispense();
    }
    
    @Override
    public void dispense(){
        System.out.println("No gumball dispensed");
    }
    
    @Override
    public String toString(){
        return "HasQuarterState";
    }
    
}
