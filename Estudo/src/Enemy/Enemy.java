/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enemy;
import Observer.Observable;
import Observer.Observer;
/**
 *
 * @author vitor
 */
public abstract class Enemy implements Observer{
    
    private int headX, headY;
    private Observable observed;
    private String name;
    
    public Enemy(Observable obs, String name, int x, int y){
        setObservable(obs);
        setName(name);
        setHeadX(x);
        setHeadY(y);
    }
    
    public void setObservable(Observable obs){
        this.observed = obs;   
        if(this.observed != null)
            this.observed.addObserver(this);
    }
    
    public void unsub(){
        if(observed != null){
            observed.removeObserver(this);
        }
    }
    
    public void setHeadX(int x){
        this.headX = x;
    }
    
    public int getHeadX(){
        return this.headX;
    }
    
    public void setHeadY(int y){
        this.headY = y;
    }
    
    public int getHeadY(){
        return this.headY;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void chase(){
        System.out.println(getName() + " is chasing x: " + getHeadX() + " and y: "
             + getHeadY() + " down.");
    }
    
    @Override
    public void update(int x, int y){
        setHeadX(x);
        setHeadY(y);
        chase();
    }
    
}
