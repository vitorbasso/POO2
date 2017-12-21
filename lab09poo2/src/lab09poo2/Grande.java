/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09poo2;

/**
 *
 * @author vitor
 */
public class Grande extends Estado{
    
    public Grande(Mario mario){
        super(mario);
    }
    
    @Override
    public void pegarFlor(){
        System.out.println("Pegou flor como mario grande virou mario fogo");
        mario.setEstado(mario.getFogoEstado());
    }
    
    @Override
    public void pegarCapa(){
        System.out.println("Pegou pena como mario grande virou mario capa");
        mario.setEstado(mario.getCapaEstado());
    }
    
    @Override
    public void levarDano(){
        System.out.println("Levou Dano como mario Grande Virou Mario Pequeno");
        mario.setEstado(mario.getPequenoEstado());
    }
    
}
