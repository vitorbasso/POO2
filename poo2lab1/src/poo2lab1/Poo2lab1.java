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
        Personagem principal = new Persona1("Mago", 0, 0);
        Personagem principal2 = new Persona2("Cavaleiro", 0, 0);
        Personagem principal3 = new Persona3("Arqueiro", 0, 0);
        
        ObservingEnemy enemy1 = new Enemy1("Arqueiro maligno");
        ObservingEnemy enemy2 = new Enemy2("Mago maligno");
        ObservingEnemy enemy3 = new Enemy3("Cavaleiro maligno");
        
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
        
        principal.addObserver(enemy1);
        principal2.addObserver(enemy1);
        principal2.addObserver(enemy2);
        principal3.addObserver(enemy1);
        principal3.addObserver(enemy2);
        principal3.addObserver(enemy3);
        
        principal.alterPos(1, 2);
        principal2.alterPos(3,4);
        principal3.alterPos(0, 1);
        
        
        
    }
    
}
