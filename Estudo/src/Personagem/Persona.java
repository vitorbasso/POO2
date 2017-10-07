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


/**
 *
 * @author vitor
 */
public abstract class Persona implements Observable{
    
    private AtaqueInterface ataque;
    private CorrerInterface corrida;
    private PuloInterface pulo;
    private ArrayList<Observer> observers;
    
    private int x,y;
    
    public Persona(AtaqueInterface a, CorrerInterface c, PuloInterface p){
        observers = new ArrayList();
        setAtaque(a);
        setCorrer(c);
        setPulo(p);
        setX(0);
        setY(0);
        
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
    
    public void atacar(){
        ataque.atacar();
    }
    
    public void pular(){
        pulo.pular();
    }
    
    public void correr(){
        corrida.correr();
    }
    
    
}
