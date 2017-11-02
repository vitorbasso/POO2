/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APIs;

/**
 *
 * @author vitor
 */
public class CellingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    
    String location;
    int speed;
    
    public CellingFan(String location){
        this.location = location;
        
        speed = OFF;
    }
    
    public void high(){
        this.speed = HIGH;
        System.out.println("Celling fan : " + speed);
    }
    
    public void medium(){
        speed = MEDIUM;
        System.out.println("Celling fan : " + speed);
    }
    
    public void low(){
        speed = LOW;
        System.out.println("Celling fan : " + speed);
    }
    
    public void off(){
        speed = OFF;
        System.out.println("Celling fan : " + speed);
    }
    
    public int getSpeed(){
        return speed;
    }
}
