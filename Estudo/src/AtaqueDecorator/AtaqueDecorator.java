/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtaqueDecorator;
import Ataque.AtaqueInterface;
import Personagem.Persona;

/**
 *
 * @author vitor
 */

public abstract class AtaqueDecorator implements AtaqueInterface{
    protected AtaqueInterface ataque;
    private String description;
    private Element elemento;
    private int multiplicadorDano;
    
    public AtaqueDecorator(AtaqueInterface ataque, String description, Element element, int multDano){
        this.ataque = ataque;
        setDescription(description);
        this.elemento = element;
        setMultiplicadorDano(multDano);
    }
    
    public void setMultiplicadorDano(int multDano){
        this.multiplicadorDano = multDano;
    }
    
    public int getMultiplicadorDano(){
        return this.multiplicadorDano;
    }
    
    @Override
    public int getDano(){
        return (getMultiplicadorDano() * ataque.getDano());
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return ataque.getDescription() + this.description;
    }
    
    @Override
    public void atacar(Persona persona){
        System.out.println(getDescription());
        persona.tomarDano(this.getDano());
    }
    
}
