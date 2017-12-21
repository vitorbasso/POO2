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
public abstract class Estado {
    
    Mario mario;
    
    public Estado(Mario mario){
        this.mario = mario;
    }
    
    public void pegarCogumelo(){
        System.out.println("Ganhou 1000 pontos");
        mario.addPontos(1000);
    }
    
    public abstract void pegarFlor();
    
    public abstract void pegarCapa();
    
    public abstract void levarDano();
    
}
