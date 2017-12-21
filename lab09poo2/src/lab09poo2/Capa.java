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
public class Capa extends Estado{
    
    
    public Capa(Mario mario){
        super(mario);
    }
    
    @Override
    public void pegarFlor(){
        System.out.println("Pegou Mario fogo como mario capa, virou mario fogo");
        mario.setEstado(mario.getFogoEstado());
    }
    
    @Override
    public void pegarCapa(){
        System.out.println("Pegou pena como mario Capa Ganhou 1000 pontos");
        mario.addPontos(1000);
    }
    
    @Override
    public void levarDano(){
        System.out.println("Levou dano como mario Capa, virou Mario grande");
        mario.setEstado(mario.getGrandeEstado());
    }
    
}
