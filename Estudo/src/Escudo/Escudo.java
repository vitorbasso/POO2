/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escudo;
import AtaqueDecorator.Element;
import Ataque.AtaqueInterface;
import Personagem.Persona;

/**
 *
 * @author vitor
 */
public abstract class Escudo {
    protected Escudo next;
    protected Element elemento;
    
    public Escudo(Element elem){
        this.next = null;
        this.setElemento(elem);
    }
    
    public void setElemento(Element elem){
        this.elemento = elem;
    }
    
    public Element getElemento(){
        return this.elemento;
    }
    
    public void setNext(Escudo proximoEscudo){
        if(this.next == null){
            next = proximoEscudo;
        }else{
            next.setNext(proximoEscudo);
        }
    }
    
    public boolean podeDefender(Element elem){
        return getElemento() == elem;
    }
    
    public void defender(AtaqueInterface ataque, Persona persona) throws Exception{
        if(podeDefender(ataque.getElemento())){
            System.out.println("Ataque defendido pelo escudo");
        }else{
            if(next == null){
                
            }
        }
    }
    
}
