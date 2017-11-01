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
public class TvOffCommand implements Command{
    private Tv tv;
    
    public TvOffCommand(Tv tv){
        this.tv = tv;
    }
    
    @Override
    public void execute(){
        tv.off();
    }
    
    @Override
    public void undo(){
        tv.on();
    }
    
}
