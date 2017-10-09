/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ataque;
import AtaqueDecorator.Element;
import Personagem.Persona;

/**
 *
 * @author vitor
 */
public class AtaqueFraco implements AtaqueInterface{
    
    private String description;
    private int dano;
    private Element elemento;
    
    public AtaqueFraco(){
        setDescription("Ataque Fraco");
        setDano(2);
        this.elemento = Element.SEM_ELEMENTO;
        
    }
    
    @Override
    public Element getElemento(){
        return this.elemento;
    }
    
    public void setDano(int dano){
        this.dano = dano;
    }
    
    @Override
    public int getDano(){
        return this.dano;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    @Override
    public void atacar(Persona persona){
        System.out.println(getDescription());
        persona.receberAtaque(this);
    }
    
}
