/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab8;
import Personagem.*;
import Enemy.*;
import AtaqueDecorator.*;
import Escudo.*;
import Factory.*;

/**
 *
 * @author vitor
 */
public class Poo2lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FactoryInterface factory = EasyFactory.getInstance();
        
        
       
        Persona personagem1 = factory.criarPersona("Personagem 1");
        Persona personagem2 = factory.criarPersona("Personagem 2");
        Persona personagem3 = factory.criarPersona("Personagem 3");
        
        
        System.out.println(personagem1.getNome() + ":");
        personagem1.correr();
        personagem1.pular();
        personagem1.atacar(personagem2);
        
        System.out.println("\n" + personagem2.getNome() + ":");
        personagem2.correr();
        personagem2.pular();
        personagem2.atacar(personagem1);
        
        System.out.println("\n" + personagem3.getNome() + ":");
        personagem3.correr();
        personagem3.pular();
        personagem3.atacar(personagem1);
        
        Enemy enemy1 = new Enemy1(personagem1);
        Enemy enemy2 = new Enemy2(personagem1);
        Enemy enemy3 = new Enemy3(personagem1);
        
        System.out.println("\n");
        personagem1.setPosition(1, 1);
        System.out.println("\n");
        personagem2.setPosition(2,2);
        
        enemy2.setObservable(personagem2);
        
        personagem2.setPosition(2,2);
        personagem2.setPosition(3,2);
        
    }
    
}
