/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;
import APIs.Light;

/**
 *
 * @author vitor
 */
public class LightOnCommand implements Command{
    
    Light light;
    
    public LightOnCommand(Light light){
        this.light = light;
    }
    
    public void execute(){
        light.on();
    }
    
}
