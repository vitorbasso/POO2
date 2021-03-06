/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;
import APIs.GarageDoor;

/**
 *
 * @author vitor
 */
public class GarageDoorOpenCommand implements Command{
    
    GarageDoor garageDoor;
    
    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    
    @Override
    public void execute(){
        this.garageDoor.up();
        this.garageDoor.lightOn();
    }
    
    @Override
    public void undo(){
        this.garageDoor.down();
        this.garageDoor.lightOff();
    }
    
}
