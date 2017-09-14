/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab1;

import Correr.Run;
import Atacar.Atac;
import Pular.Jump;
import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class Personagem{
    Atac atacStr;
    Jump jumpHeight;
    Run runSpeed;
    private String name;
    private int x, y;
    private ArrayList<ObservingEnemy> observers = new ArrayList<ObservingEnemy>();
    
    public Personagem(String nome, int x, int y){
        setName(nome);
        setX(x);
        setY(y);
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setX(int pos){
        this.x = pos;
    }
    
    public int getX(){
        return this.x;
    }
    
    public void setY(int pos){
        this.y = pos;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void alterPos(int x, int y){
        if(getX() != x || getY() != y){
            setX(x);
            setY(y);
            sendObserverFlag(x, y);
        }
    }
    
    public void addObserver(ObservingEnemy observer){
        observers.add(observer);
    }
    
    public void removeObserver(ObservingEnemy observer){
        observers.remove(observer);
    }
    
    public void sendObserverFlag(int x, int y){
        this.observers.forEach(observer->observer.follow(x, y, this));
    }
    
    
    
    public void setAtac(Atac newAtac){
        atacStr = newAtac;
    }
   
    public void getAtac(){
        System.out.println("Ataque " + atacStr.getPower());
    }
   
    public void setJump(Jump newJump){
        jumpHeight = newJump;
    }
   
    public void getJump(){
        jumpHeight.pular();
    }

    public void setRun(Run newRun){
        runSpeed = newRun;
    }
    
    public void getRun(){
        runSpeed.correr();
    }
}
