/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap6poo2;
import remote.SimpleRemoteControl;
import command.*;
import APIs.*;

/**
 *
 * @author vitor
 */
public class Cap6POO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        LightOnCommand lightOn = new LightOnCommand(new Light());
        
        remoteControl.setCommand(lightOn);
        
        remoteControl.buttonWasPressed();
        
    }
    
}
