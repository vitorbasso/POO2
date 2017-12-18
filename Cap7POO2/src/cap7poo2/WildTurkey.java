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
public class WildTurkey implements TurkeyInterface{
    @Override
    public void gobble(){
        System.out.println("Gobble Gobble!");
    }
    
    @Override
    public void fly(){
        System.out.println("I`m flying a short distance!");
    }
}
