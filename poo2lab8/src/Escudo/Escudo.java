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
    private String nome;
    
    public Escudo(Element elem, String name){
        this.next = null;
        this.setElemento(elem);
        this.setNome(name);
    }
    
    public void setNome(String name){
        this.nome = name;
    }
    
    public String getNome(){
        return this.nome;
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
    
    public int defender(AtaqueInterface ataque){
        if(podeDefender(ataque.getElemento())){
            System.out.println(ataque.getDescription() + " bloqueado por " + getNome() + ".");
            return 0;
        }else{
            if(next == null){
                return ataque.getDano();
            }else{
                return next.defender(ataque);
            }
        }
    }
    
}
