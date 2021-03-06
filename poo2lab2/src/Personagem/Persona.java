/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;

import Ataque.AtaqueInterface;
import Pulo.PuloInterface;
import Correr.CorrerInterface;
import Observer.Observable;
import Observer.Observer;
import java.util.ArrayList;
import Escudo.Escudo;


/**
 *
 * @author vitor
 */
public abstract class Persona implements Observable{
    
    private AtaqueInterface ataque;
    private CorrerInterface corrida;
    private PuloInterface pulo;
    private ArrayList<Observer> observers;
    private int pontosVida;
    private String nome;
    private Escudo escudos;
    
    private int x,y;
    
    public Persona(AtaqueInterface a, CorrerInterface c, PuloInterface p, String name){
        observers = new ArrayList();
        setAtaque(a);
        setCorrer(c);
        setPulo(p);
        setX(0);
        setY(0);
        setPontosVida(100);
        setNome(name);
        escudos = null;
    }
    
    public void addEscudo(Escudo esc){
        if(escudos == null){
            escudos = esc;
        }else{
            escudos.setNext(esc);
        }
    }
    
    public void setNome(String name){
        this.nome = name;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getPontosVida(){
        return this.pontosVida;
    }
    
    public void setPontosVida(int pontos){
        this.pontosVida = pontos;
        if(this.pontosVida == 0)
            System.out.println("Personagem Morreu");
    }
    
    public void tomarDano(int dano){
        int newVida = getPontosVida() - dano;
        if(newVida < 0)
            newVida = 0;
        setPontosVida(newVida);
        System.out.println(this.getNome() + " tomou " + dano + " de dano. Ficou com " + getPontosVida() + " pontos de vida.");
        if(getPontosVida() == 0){
            System.out.println(this.getNome() + " morreu.");
        }
    }
    
    public void receberAtaque(AtaqueInterface ataque){
        int dano = ataque.getDano();
        if(escudos != null)
            dano = escudos.defender(ataque);
        
        tomarDano(dano);
    }
    
    @Override
    public void addObserver(Observer obs){
        observers.add(obs);
    }
    
    @Override
    public void removeObserver(Observer obs){
        int index = observers.indexOf(obs);
        if(index >= 0){
            observers.remove(index);
        }
    }
    
    @Override
    public void notifyObservers(){
        observers.forEach((observer)->{observer.update(getX(), getY());});
    }
    
    public void setPosition(int x, int y){
        boolean changed = false;
        if(x != getX() || y != getY()){
            changed = true;
        }
        
        setX(x);
        setY(y);
        
        if(changed)
            notifyObservers();
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getX(){
        return x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public int getY(){
        return y;
    }
    
    public void setAtaque(AtaqueInterface a){
        this.ataque = a;
    }
    
    public void setCorrer(CorrerInterface c){
        this.corrida = c;
    }
    
    public void setPulo(PuloInterface p){
        this.pulo = p;
    }
    
    public void atacar(Persona persona){
        System.out.println(this.getNome() + " atacou " + persona.getNome() + " e...");
        this.ataque.atacar(persona);
    }
    
    public AtaqueInterface getAtaque(){
        return this.ataque;
    }
    
    public void pular(){
        this.pulo.pular();
    }
    
    public void correr(){
        this.corrida.correr();
    }
    
    
}
