/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;
import Ataque.AtaqueForte;
import Correr.CorrerMedio;
import Pulo.PuloMedio;

/**
 *
 * @author vitor
 */
public class Persona1 extends Persona{
    
    public Persona1(){
        super(new AtaqueForte(), new CorrerMedio(), new PuloMedio());
    }
    
}
