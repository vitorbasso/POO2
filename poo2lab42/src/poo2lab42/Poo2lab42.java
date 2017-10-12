/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab42;

/**
 *
 * @author Vitor Martins Basso 11611BCC034
 * @author Vitor Hugo Honorato 11521BCC003
 */
public class Poo2lab42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomeTheaterFacade ht = new HomeTheaterFacade(new Amplificador(), new CDPlayer(),
        new DVDPlayer(), new LuzAmbiente(), new Pipoqueira(), new Projetor(), new Sintonizador(), new Tela());
        
        ht.assistirFilme(new Filme());
        ht.pararFilme();
        
        ht.ouvirCD(new Cd());
        ht.pararCD();
    }
    
}
