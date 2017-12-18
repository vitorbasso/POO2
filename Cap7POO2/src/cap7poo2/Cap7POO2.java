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
public class Cap7POO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        DuckInterface duck = new MallarDuck();
        
        DuckInterface turkeyDuck = new TurkeyDuckAdapter(turkey);
        
        System.out.println("Testing out turkey:");
        turkey.gobble();
        turkey.fly();
        
        System.out.println("\nTesting out duck:");
        testDuck(duck);
        
        System.out.println("\nTesting out turkey disguised as duck:");
        testDuck(turkeyDuck);
    }
    
    public static void testDuck(DuckInterface duck){
        duck.quack();
        duck.fly();
    }
    
}
