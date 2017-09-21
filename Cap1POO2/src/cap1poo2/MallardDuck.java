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
public class MallardDuck extends Duck{
    
    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
    
    @Override
    public void display(){
        System.out.println("I`m a real Mallard duck!\n");
    }
    
}
