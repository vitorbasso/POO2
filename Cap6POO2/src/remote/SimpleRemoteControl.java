/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote;
import command.Command;

/**
 *
 * @author vitor
 */
public class SimpleRemoteControl {
    Command slot;
    
    public void setCommand(Command command){
        this.slot = command;
    }
    
    public void buttonWasPressed(){
        slot.execute();
    }
    
}
