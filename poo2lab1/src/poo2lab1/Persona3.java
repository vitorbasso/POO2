/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab1;

import Atacar.AtacStrong;
import Correr.RunFast;
import Pular.JumpLow;

/**
 *
 * @author vitor
 */
public class Persona3 extends Personagem{
    public Persona3(){
        setAtac(new AtacStrong());
        setRun(new RunFast());
        setJump(new JumpLow());
    }
}
