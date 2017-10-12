/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab42;

/**
 *
 * @author vitor
 */
public class CDPlayer {
    public void ligar(){
        System.out.println("CDPlayer - Ligar");
    }
  
    public void desligar(){
        System.out.println("CDPlayer - Desligar");
    }
    
    public void eject(){
        System.out.println("CDPlayer - Ejetar");
    }
    
    public void pause(){
        System.out.println("CDPlayer - pausar");
    }
    
    public void play(Cd cd){
        System.out.println("CDPlayer - Play em " + cd.nome);
    }
    
    public void stop(){
        System.out.println("CDPlayer - Stop");
    }
}
