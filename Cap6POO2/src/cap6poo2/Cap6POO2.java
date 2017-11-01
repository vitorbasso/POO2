/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap6poo2;
import remote.RemoteControl;
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
        
       RemoteControl remoteControl = new RemoteControl();
       
       Light light = new Light();
       LightOnCommand lightOn = new LightOnCommand(light);
       LightOffCommand lightOff = new LightOffCommand(light);
       
       GarageDoor garageDoor = new GarageDoor();
       GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
       GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
       
       Stereo stereo = new Stereo();
       StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);
       StereoOnWithDvdCommand stereoOnWithDvd = new StereoOnWithDvdCommand(stereo);
       StereoOnWithRadioCommand stereoOnWithRadio = new StereoOnWithRadioCommand(stereo);
       StereoOffCommand stereoOff = new StereoOffCommand(stereo);
       
       Tv tv = new Tv();
       TvOnCommand tvOn = new TvOnCommand(tv);
       TvOffCommand tvOff = new TvOffCommand(tv);
       
       FaucetControl faucetControl = new FaucetControl();
       FaucetOpenCommand faucetOpen = new FaucetOpenCommand(faucetControl);
       FaucetCloseCommand faucetClose = new FaucetCloseCommand(faucetControl);
       
       remoteControl.setCommand(0, lightOn, lightOff);
       remoteControl.setCommand(1, garageDoorOpen, garageDoorClose);
       remoteControl.setCommand(2, stereoOnWithCd, stereoOff);
       remoteControl.setCommand(3, stereoOnWithDvd, stereoOff);
       remoteControl.setCommand(4, stereoOnWithRadio, stereoOff);
       remoteControl.setCommand(5, tvOn, tvOff);
       remoteControl.setCommand(6, faucetOpen, faucetClose);
       
        System.out.println(remoteControl);
        
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
        
        remoteControl.onButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);
        
        remoteControl.onButtonWasPressed(5);
        remoteControl.offButtonWasPressed(5);
        
        remoteControl.onButtonWasPressed(6);
        remoteControl.offButtonWasPressed(6);
        
        remoteControl.onButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();
        
    }
    
}
