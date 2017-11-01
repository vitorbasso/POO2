/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;
import APIs.Tv;

/**
 *
 * @author vitor
 */
public class TvOnCommand implements Command{
    private Tv tv;
    
    public TvOnCommand(Tv tv){
        this.tv = tv;
    }
    
    @Override
    public void execute(){
        tv.on();
        tv.setInputChannel();
        tv.setVolume();
    }
    
    @Override
    public void undo(){
        tv.off();
    }
    
}
