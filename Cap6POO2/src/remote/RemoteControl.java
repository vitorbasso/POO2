/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote;

import command.Command;
import command.NoCommand;

/**
 *
 * @author vitor
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command lastCommand;
    
    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        
        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        lastCommand = noCommand;
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }
    
    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }
    
    public void undoButtonWasPressed(){
        lastCommand.undo();
    }
    
    @Override
    public String toString(){
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        stringBuilder.append("\n----- Remote Control ------\n");
        for(int i = 0; i < 7; i++){
            stringBuilder.append("[slot ").append(i).append(1).append("] ").append(onCommands[i].getClass().getName()).append(" ").append(offCommands[i].getClass().getName()).append("\n");
        }
        return stringBuilder.toString();
    }
    
}
