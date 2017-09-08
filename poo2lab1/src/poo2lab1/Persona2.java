/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab1;

import Atacar.AtacMid;
import Correr.RunFast;
import Pular.JumpHigh;

/**
 *
 * @author vitor
 */
public class Persona2 extends Personagem{
    public Persona2(){
        setAtac(new AtacMid());
        setRun(new RunFast());
        setJump(new JumpHigh());
    }
}
