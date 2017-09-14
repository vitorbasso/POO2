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
public abstract class AtacDecorator extends Atac{
    Atac atac;
    public AtacDecorator(Atac atack){
        super(atack.getPower());
    }
}
