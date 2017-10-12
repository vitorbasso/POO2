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
public class BalanceCalculatorAdapter implements BalanceResolver{
    
    private BalanceCalculator balanceCalculator;
    
    public BalanceCalculatorAdapter(BalanceCalculator balanceCalculator){
        this.balanceCalculator = balanceCalculator;
    }
    
    @Override
    public void balanceFor(String account, String date){
        balanceCalculator.calculateBalance(account, date);
    }
    
}
