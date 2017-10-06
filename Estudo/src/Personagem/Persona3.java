/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;

import Ataque.AtaqueForte;
import Correr.CorrerForte;
import Pulo.PuloFraco;

/**
 *
 * @author vitor
 */
public class Persona3 extends Persona{
    
    public Persona3(){
        super(new AtaqueForte(), new CorrerForte(), new PuloFraco());
    }
    
}
