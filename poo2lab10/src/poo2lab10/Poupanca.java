/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab10;
import poo2lab10.TipoDePessoa.PessoaFisica;

/**
 *
 * @author vitor
 */
public class Poupanca extends ContaAbstrata{
    
    public Poupanca(){
        super(new PessoaFisica());
    }
    
    @Override
    public boolean desejaCartaoCredito(){
        return false;
    }
    
    @Override
    protected void finalizar(){
        System.out.println("Conta poupanca aberta com sucesso!");
    }
    
}
