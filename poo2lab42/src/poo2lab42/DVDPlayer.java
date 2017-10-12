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
public class DVDPlayer {
    public void ligar(){
        System.out.println("DVDPlayer - Ligar");
    }
    
    public void desligar(){
        System.out.println("DVDPlayer - Desligar");
    }
    
    public void eject(){
        System.out.println("DVDPlayer - Ejetar");
    }
    
    public void pause(){
        System.out.println("DVDPlayer - pausar");
    }
    
    public void play(Filme filme){
        System.out.println("DVDPlayer - Play em " + filme.nome);
    }
    
    public void stop(){
        System.out.println("DVDPlayer - Stop");
    }
    
    public void setSurroundAudio(){
        System.out.println("DVDPlayer - Setar Surround Audio");
    }
    
    public void setStereoAudio(){
        System.out.println("DVDPlayer - Setar Stereo Audio");
    }
}
