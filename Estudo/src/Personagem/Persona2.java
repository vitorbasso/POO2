/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;
import Ataque.AtaqueMedio;
import Correr.CorrerForte;
import Pulo.PuloForte;

/**
 *
 * @author vitor
 */
public class Persona2 extends Persona{
    
    public Persona2(){
        super(new AtaqueMedio(), new CorrerForte(), new PuloForte());
    }
    
}
