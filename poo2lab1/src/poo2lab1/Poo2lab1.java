/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab1;

/**
 *
 * @author Vitor Martins Basso 11611BCC034
 * @author Vitor Hugo Honorato 11521BCC003
 */
public class Poo2lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona1 principal = new Persona1();
        Persona2 principal2 = new Persona2();
        Persona3 principal3 = new Persona3();
        
        System.out.println("Personagem 1: \n");
        principal.getAtac();
        principal.getJump();
        principal.getRun();
        
        System.out.println("\nPersonagem 2: \n");
        principal2.getAtac();
        principal2.getJump();
        principal2.getRun();
        
        System.out.println("\nPersonagem 3: \n");
        principal3.getAtac();
        principal3.getJump();
        principal3.getRun();
        
    }
    
}
