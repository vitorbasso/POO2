/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudo;
import Personagem.*;

/**
 *
 * @author vitor
 */
public class Estudo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Persona personagem1 = new Persona1();
        Persona personagem2 = new Persona2();
        Persona personagem3 = new Persona3();
        
        
        System.out.println("Personagem1:");
        personagem1.correr();
        personagem1.pular();
        personagem1.atacar();
        
        System.out.println("\nPersonagem2:");
        personagem2.correr();
        personagem2.pular();
        personagem2.atacar();
        
        System.out.println("\nPersonagem3:");
        personagem3.correr();
        personagem3.pular();
        personagem3.atacar();
        
    }
    
}
