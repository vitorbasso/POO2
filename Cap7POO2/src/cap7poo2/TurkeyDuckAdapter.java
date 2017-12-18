/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap7poo2;

/**
 *
 * @author vitor
 */
public class TurkeyDuckAdapter implements DuckInterface{
    
    TurkeyInterface turkey;
    
    public TurkeyDuckAdapter (TurkeyInterface turkey){
        this.turkey = turkey;
    }
    
    @Override
    public void quack(){
        this.turkey.gobble();
    }
    
    @Override
    public void fly(){
        for(int i = 0; i < 5; i++)
            this.turkey.fly();
    }
    
}
