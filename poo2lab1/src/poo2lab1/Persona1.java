/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab1;
import Atacar.AtacStrong;
import Pular.JumpMid;
import Correr.RunMid;


/**
 *
 * @author vitor
 */
public class Persona1 extends Personagem{
    
    public Persona1 (String name, int x, int y){
        
        super(name, x, y);
            
        setAtac(new AtacStrong());
        setRun(new RunMid());
        setJump(new JumpMid());
    }
    
}
