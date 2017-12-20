/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2lab10;
import java.util.Scanner;
import poo2lab10.TipoDePessoa.PessoaJuridica;

/**
 *
 * @author vitor
 */
public class CorrentePessoaJuridica extends ContaAbstrata{
    
    public CorrentePessoaJuridica(){
        super(new PessoaJuridica());
    }
    
    @Override
    protected void configurarLimite(){
        
        Scanner scanner = new Scanner(System.in);
        
        double limite;
        
        do{
            System.out.println("Por favor digite o limite que deseja da sua conta de pessoa juridica ( maximo de 100000): ");
            limite = scanner.nextDouble();
           
            if(limite < 0 || limite > 100000){
                System.out.println("Valor invalido.");
            }
            
        }while (limite < 0  || limite > 100000);
        
            System.out.println("Limite configurado com sucesso!");
        
    }
    
    @Override
    protected void finalizar(){
        System.out.println("Conta Corrente para pessoa Juridica aberta com sucesso!");
    }
    
}
