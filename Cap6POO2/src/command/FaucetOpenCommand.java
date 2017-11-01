/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;
import APIs.FaucetControl;

/**
 *
 * @author vitor
 */
public class FaucetOpenCommand implements Command{
    private FaucetControl faucetControl;
    
    public FaucetOpenCommand(FaucetControl faucetControl){
        this.faucetControl = faucetControl;
    }
    
    @Override
    public void execute(){
        this.faucetControl.openValue();
    }
    
    @Override
    public void undo(){
        this.faucetControl.closeValue();
    }
    
}
