/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap5poo2;

/**
 *
 * @author vitor
 */
public class Singleton {
    private static Singleton uniqueInstance;
    private int i;
    
    private Singleton(){
        i = 0;
    }
    
    public static Singleton getInstance(){
        if(Singleton.uniqueInstance == null){
            synchronized(Singleton.class){
                if(Singleton.uniqueInstance == null){
                    Singleton.uniqueInstance = new Singleton();
                }
            }
        }
        return Singleton.uniqueInstance;
    }
    
    public void testar(){
        System.out.println("teste com sucesso " + this.i);
        this.i++;
    }
}
