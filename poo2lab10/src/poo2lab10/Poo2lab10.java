/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab10;

/**
 *
 * @author vitor
 */
public class Poo2lab10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaAbstrata poupanca = new Poupanca();
        ContaAbstrata correnteFisica = new CorrentePessoaFisica();
        ContaAbstrata correnteJuridica = new CorrentePessoaJuridica();
        
        poupanca.abrirConta();
        correnteFisica.abrirConta();
        correnteJuridica.abrirConta();
        
    }
    
}
