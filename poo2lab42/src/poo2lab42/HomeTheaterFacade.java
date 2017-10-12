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
public class HomeTheaterFacade {
    
    Amplificador amplificador;
    CDPlayer cdPlayer;
    DVDPlayer dvdPlayer;
    LuzAmbiente luzAmbiente;
    Pipoqueira pipoqueira;
    Projetor projetor;
    Sintonizador sintonizador;
    Tela tela;
    
    public HomeTheaterFacade(Amplificador a, CDPlayer c, DVDPlayer d,
            LuzAmbiente l, Pipoqueira p, Projetor pr, Sintonizador s, Tela t){
        this.amplificador = a;
        this.cdPlayer = c;
        this.dvdPlayer = d;
        this.luzAmbiente = l;
        this.pipoqueira = p;
        this.projetor = pr;
        this.sintonizador = s;
        this.tela = t;
        
    }
    
    public void assistirFilme(Filme filme){
        System.out.println("Iniciando operacao para filme");
        pipoqueira.ligar();
        pipoqueira.cozinhar();
        luzAmbiente.dim();
        tela.descer();
        projetor.ligar();
        projetor.modoDVD();
        projetor.modoWideScreen();
        amplificador.ligar();
        amplificador.setDVD();
        amplificador.setSurroundAudio();
        amplificador.setVolume();
        dvdPlayer.ligar();
        dvdPlayer.play(filme);
        System.out.println("Tudo ok para ver o filme");
    }
    
    public void pararFilme(){
        System.out.println("Iniciando operacao para parar filme");
        pipoqueira.desligar();
        luzAmbiente.desligar();
        projetor.desligar();
        tela.subir();
        amplificador.desligar();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.desligar();
        System.out.println("Tudo desligado e filme finalizado.");
    }
    
    public void ouvirCD(Cd cd){
        System.out.println("Iniciando operacao para ouvir CD");
        amplificador.ligar();
        amplificador.setCD();
        amplificador.setSurroundAudio();
        amplificador.setVolume();
        cdPlayer.ligar();
        cdPlayer.play(cd);
        System.out.println("Tudo ok para ouvir o cd");
    }
    
    public void pararCD(){
        System.out.println("Iniciando operacao para parar CD");
        amplificador.desligar();
        cdPlayer.stop();
        cdPlayer.eject();
        cdPlayer.desligar();
        System.out.println("Tudo desligado e cd finalizado.");
    }
    
}
