/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab10;
import java.util.Scanner;
import poo2lab10.TipoDePessoa.TipoPessoa;

/**
 *
 * @author vitor
 */
public abstract class ContaAbstrata {
    Scanner input = new Scanner(System.in);
    TipoPessoa tipoCliente;
    
    public ContaAbstrata(TipoPessoa pessoa){
        this.tipoCliente = pessoa;
    }
    
    final public void abrirConta(){
        cadastrarPessoa();
        
        validarPessoa();
        
        depositarValorInicial();
        
        configurarLimite();
        
        cadastrarSenha();
        
        if(desejaCartaoCredito()){
            solicitarCartaoCredito();
        }
        
        finalizar();
    }
    
    private void cadastrarPessoa(){
        tipoCliente.cadastrarPessoa();
    }
    
    private void validarPessoa(){
        tipoCliente.validarPessoa();
    }
    
    private void depositarValorInicial(){
        
        System.out.println("Qual o valor inicial a ser depositado?");
        double valorInicial = input.nextDouble();
        
        if(valorInicial > 0)
            System.out.println("Valor inicial de " + valorInicial + " depositado.");
    }
    
    protected void configurarLimite(){}
    
    private void cadastrarSenha(){
        System.out.println("Digite a senha para sua conta: ");
        String senha = input.next();
    }
    
    protected boolean desejaCartaoCredito(){
        System.out.println("O cliente gostaria de um cartao de credito? (y/n): ");
        String resposta = input.next();
        return resposta.toLowerCase().startsWith("y");
    }
    
    private void solicitarCartaoCredito(){
        System.out.println("Solicitacao para cartao de credito realizada");
    }
    
    protected abstract void finalizar();
    
}
