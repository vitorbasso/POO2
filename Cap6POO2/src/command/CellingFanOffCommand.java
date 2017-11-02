/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;
import APIs.CellingFan;

/**
 *
 * @author vitor
 */
public class CellingFanOffCommand implements Command{
    private CellingFan cellingFan;
    private int prevSpeed;
    
    public CellingFanOffCommand(CellingFan cellingFan){
        this.cellingFan = cellingFan;
        prevSpeed = cellingFan.getSpeed();
    }
    
    @Override
    public void execute(){
        prevSpeed = cellingFan.getSpeed();
        cellingFan.off();
    }
    
    @Override
    public void undo(){
        switch(prevSpeed){
            case CellingFan.HIGH:
                cellingFan.high();
                break;
            case CellingFan.MEDIUM:
                cellingFan.medium();
                break;
            case CellingFan.LOW:
                cellingFan.low();
                break;
            default:
                cellingFan.off();
                break;
        }
    }
    
}
