/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab1;

/**
 *
 * @author vitor
 */
public abstract class ObservingEnemy {
    private String name;
    public void follow(int x, int y, Personagem following){
        System.out.println(this.getName() + " is following the player " + following.getName() + " to position x = " + x + " and y = " + y + "\n");
    }
    public ObservingEnemy(String nome){
        setName(nome);
    }
    public void setName(String name1){
        this.name = name1;
    }
    
    public String getName(){
        return this.name;
    }
    
    
}
