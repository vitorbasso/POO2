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
public class GumballMachine {
    
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    
    State state = soldOutState;
    int count = 0;
    
    public GumballMachine(int numGumballs){
        
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = numGumballs;
        if(count > 0){
            state = noQuarterState;
        }
        
    }
    
    public void insertQuarter(){
        state.insertQuarter();
    }
    
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    
    public void turnCrank(){
        state.turnCrank();
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0 ){
            count = count - 1;
        }
    }
    
    public State getSoldOutState(){
        return this.soldOutState;
    }
    
    public State getNoQuarterState(){
        return this.noQuarterState;
    }
    
    public State getHasQuarterState(){
        return this.hasQuarterState;
    }
    
    public State getSoldState(){
        return this.soldState;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public State getState(){
        return this.state;
    }
    
    public void fill(int numGumballs){
        
        count += numGumballs;
        
        if(count > 0 && getState() == getSoldOutState()){
            setState(getNoQuarterState());
        }
        
    }
    
}
