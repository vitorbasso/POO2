/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;

import Ataque.AtaqueInterface;
import Pulo.PuloInterface;
import Correr.CorrerInterface;


/**
 *
 * @author vitor
 */
public abstract class Persona {
    
    private AtaqueInterface ataque;
    private CorrerInterface corrida;
    private PuloInterface pulo;
    
    public Persona(AtaqueInterface a, CorrerInterface c, PuloInterface p){
        setAtaque(a);
        setCorrer(c);
        setPulo(p);
    }
    
    public void setAtaque(AtaqueInterface a){
        this.ataque = a;
    }
    
    public void setCorrer(CorrerInterface c){
        this.corrida = c;
    }
    
    public void setPulo(PuloInterface p){
        this.pulo = p;
    }
    
    public void atacar(){
        ataque.atacar();
    }
    
    public void pular(){
        pulo.pular();
    }
    
    public void correr(){
        corrida.correr();
    }
    
    
}
