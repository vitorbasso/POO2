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
public class NOT implements ExpressaoLogica{
    ExpressaoLogica expressaoLogica;
    
    public NOT(ExpressaoLogica expressaoLogica){
        this.expressaoLogica = expressaoLogica;
    }
    
    @Override
    public boolean operacao(){
        return !(expressaoLogica.operacao());
    }
    
}
