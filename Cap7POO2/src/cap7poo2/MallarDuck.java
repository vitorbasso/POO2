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
public class MallarDuck implements DuckInterface{
    
    @Override
    public void quack(){
        System.out.println("Quack!");
    }
    
    @Override
    public void fly(){
        System.out.println("I`m flying!");
    }
    
}
