/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ataque;

/**
 *
 * @author vitor
 */
public class AtaqueFraco implements AtaqueInterface{
    
    private String description;
    
    public AtaqueFraco(){
        setDescription("Ataque Fraco");
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    @Override
    public void atacar(){
        System.out.println(getDescription());
    }
    
}