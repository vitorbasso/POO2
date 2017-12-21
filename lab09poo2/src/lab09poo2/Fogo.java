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
public class Fogo extends Estado{
    
    public Fogo(Mario mario){
        super(mario);
    }
    
    @Override
    public void pegarFlor(){
        System.out.println("Pegou flor como mario fogo Ganhou 1000 pontos");
        mario.addPontos(1000);
    }
    
    @Override
    public void pegarCapa(){
        System.out.println("Pegou capa como mario capa virou mario fogo");
        mario.setEstado(mario.getCapaEstado());
    }
    
    @Override
    public void levarDano(){
        System.out.println("Levou dano como mario fogo virou mario grande");
        mario.setEstado(mario.getGrandeEstado());
    }
    
}
