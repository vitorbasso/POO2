/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab1;

import Correr.Run;
import Atacar.Atac;
import Pular.Jump;

/**
 *
 * @author vitor
 */
public class Personagem{
    Atac atacStr;
    Jump jumpHeight;
    Run runSpeed;
    
    public void setAtac(Atac newAtac){
        atacStr = newAtac;
    }
   
    public void getAtac(){
        atacStr.atacar();
    }
   
    public void setJump(Jump newJump){
        jumpHeight = newJump;
    }
   
    public void getJump(){
        jumpHeight.pular();
    }

    public void setRun(Run newRun){
        runSpeed = newRun;
    }
    
    public void getRun(){
        runSpeed.correr();
    }
}
