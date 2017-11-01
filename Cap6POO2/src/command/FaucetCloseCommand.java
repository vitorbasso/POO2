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
public class FaucetCloseCommand implements Command{
    private FaucetControl faucetControl;
    
    public FaucetCloseCommand(FaucetControl faucetControl){
        this.faucetControl = faucetControl;
    }
    
    @Override
    public void execute(){
        this.faucetControl.closeValue();
    }
    
    @Override
    public void undo(){
        this.faucetControl.openValue();
    }
    
}
