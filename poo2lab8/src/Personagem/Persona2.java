/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;
import Ataque.*;
import Correr.*;
import Pulo.*;

/**
 *
 * @author vitor
 */
public class Persona2 extends Persona{
    
    public Persona2(String nome, AtaqueInterface ataque, CorrerInterface correr, PuloInterface pulo){
        super(ataque, correr, pulo, nome);
    }
    
}
