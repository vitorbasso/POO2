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
public class Poo2lab12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExpressaoLogica e = new AND(new AND(new Operando(true), new XOR(new Operando(false), new Operando(true))),new NOT(new Operando(false)));
        if(e.operacao())
            System.out.println("true");
        else
            System.out.println("false");
        
        ExpressaoLogica e1 = new NOT(new Operando(true));
        if(e1.operacao())
            System.out.println("true");
        else
            System.out.println("false");
            
    }
    
}
