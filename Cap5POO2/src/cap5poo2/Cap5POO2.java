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
public class Cap5POO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singleton teste = Singleton.getInstance();
        
        teste.testar();
        
        Singleton teste2 = Singleton.getInstance();
        
        teste2.testar();
        
        Singleton teste3 = Singleton.getInstance();
        
        teste3.testar();
        
        
    }
    
}
