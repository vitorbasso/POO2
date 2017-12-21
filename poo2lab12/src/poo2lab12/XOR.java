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
public class XOR implements ExpressaoLogica{
    
    ExpressaoLogica expressaoLogica1;
    ExpressaoLogica expressaoLogica2;
    
    public XOR(ExpressaoLogica expressaoLogica1, ExpressaoLogica expressaoLogica2){
        this.expressaoLogica1 = expressaoLogica1;
        this.expressaoLogica2 = expressaoLogica2;
    }
    
    @Override
    public boolean operacao(){
        return (expressaoLogica1.operacao() ^ expressaoLogica2.operacao());
    }
    
}
