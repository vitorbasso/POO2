/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtaqueDecorator;
import Ataque.AtaqueInterface;

/**
 *
 * @author vitor
 */

public abstract class AtaqueDecorator implements AtaqueInterface{
    protected AtaqueInterface ataque;
    private String description;
    private Element elemento;
    
    public AtaqueDecorator(AtaqueInterface ataque, String description, Element element){
        this.ataque = ataque;
        setDescription(description);
        this.elemento = element;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    @Override
    public void atacar(){
        System.out.println(ataque.getDescription() + this.getDescription());
    }
    
}
