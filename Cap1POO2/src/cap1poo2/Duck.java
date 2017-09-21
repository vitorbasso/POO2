/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap1poo2;

/**
 *
 * @author vitor
 */
public abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;
    
    public abstract void display();
    
    public void performQuack(){
        quackBehaviour.quack();
    }
    
    public void performFly(){
        flyBehaviour.fly();
    }
    
    public void swim(){
        System.out.println("All ducks float. Including decoys\n");
    }
    
    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }
    
    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }
    
}
