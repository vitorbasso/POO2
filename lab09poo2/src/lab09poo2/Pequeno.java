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
public class Pequeno extends Estado{
    
    public Pequeno(Mario mario){
        super(mario);
    }
    
    @Override
    public void pegarCogumelo(){
        System.out.println("Pegou cogumelo como mario pequeno virou mario grande");
        mario.setEstado(mario.getGrandeEstado());
    }
    
    @Override
    public void pegarFlor(){
        System.out.println("Pegou flor como mario pequeno virou mario fogo");
        mario.setEstado(mario.getFogoEstado());
    }
    
    @Override
    public void pegarCapa(){
        System.out.println("Pegou pena como mario pequeno virou mario capa");
        mario.setEstado(mario.getCapaEstado());
    }
    
    @Override
    public void levarDano(){
        System.out.println("Levou dano como mario pequeno, morreu");
    }
    
}
