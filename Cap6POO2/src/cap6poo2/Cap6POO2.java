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
       
       Tv tv = new Tv();
       TvOnCommand tvOn = new TvOnCommand(tv);
       TvOffCommand tvOff = new TvOffCommand(tv);
       
       Stereo stereo = new Stereo();
       StereoOnWithDvdCommand stereoOnDvd = new StereoOnWithDvdCommand(stereo);
       StereoOffCommand stereoOff = new StereoOffCommand(stereo);
       
       CellingFan cellingFan = new CellingFan("Living Room");
       CellingFanLowCommand cellingFanLow = new CellingFanLowCommand(cellingFan);
       CellingFanOffCommand cellingFanOff = new CellingFanOffCommand(cellingFan);
       
       Command[] partyOn = {lightOn, tvOn, stereoOnDvd,cellingFanLow};
       Command[] partyOff = {cellingFanOff, stereoOff, tvOff, lightOff};
       
       MacroCommand partyOnMacro = new MacroCommand(partyOn);
       MacroCommand partyOffMacro = new MacroCommand(partyOff);
       
       remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
       
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPressed(0);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPressed(0);
       
        
    }
    
}
