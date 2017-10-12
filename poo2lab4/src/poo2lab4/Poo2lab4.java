/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab4;

/**
 *
 * @author vitor
 */
public class Poo2lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BalanceCalculatorA balanceCalculatorA = new BalanceCalculatorA();
        BalanceResolver balanceAdapter = new BalanceCalculatorAdapter(balanceCalculatorA);
        
        String account = "qualquer coisa";
        String date = "Outra qualquer coisa";
        
        balanceAdapter.balanceFor(account, date);
        
    }
    
}
