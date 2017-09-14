/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atacar;

/**
 *
 * @author vitor
 */
public class AtacFireBall extends AtacDecorator{
    
    public AtacFireBall(Atac attack){
        super(attack);
    }
    
    @Override
    public String getPower(){
        return super.getPower() + " de Bola de Fogo!\n";
    }
    
}
