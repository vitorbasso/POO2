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
public class GarageDoorCloseCommand implements Command{
    private GarageDoor garageDoor;
    
    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    
    @Override
    public void execute(){
        garageDoor.down();
    }
    
    @Override
    public void undo(){
        garageDoor.up();
    }
    
}
