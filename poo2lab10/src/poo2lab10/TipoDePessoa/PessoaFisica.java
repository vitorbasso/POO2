/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab10.TipoDePessoa;

/**
 *
 * @author vitor
 */
public class PessoaFisica implements TipoPessoa{
    @Override
    public void cadastrarPessoa(){
        System.out.println("Cadastro de pessoa Fisica completo.");
    }
    
    @Override
    public void validarPessoa(){
        System.out.println("Pessoa fisica validada no SPC.");
    }
}
