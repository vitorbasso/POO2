/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab12;

/**
 *
 * @author vitor
 */
public class Operando implements ExpressaoLogica{
    
    boolean operando;
    
    public Operando(boolean operando){
        this.operando = operando;
    }
    
    @Override
    public boolean operacao(){
        return operando;
    }
    
}
