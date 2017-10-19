/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Ataque.AtaqueInterface;
import Ataque.AtaqueForte;
import AtaqueDecorator.AtaqueDecorator;
import AtaqueDecorator.AtaqueDecoratorFire;
import Correr.CorrerInterface;
import Correr.CorrerForte;
import Escudo.*;
import Pulo.PuloInterface;
import Pulo.PuloForte;

/**
 *
 * @author vitor
 */
public class EasyFactory extends FactoryInterface{
    private static EasyFactory uniqueInstance = null;
    
    private EasyFactory(){}
    
    public static EasyFactory getInstance(){
        if(uniqueInstance == null){
            synchronized(EasyFactory.class){
                if(uniqueInstance == null){
                    uniqueInstance = new EasyFactory();
                }
            }
        }
        return uniqueInstance;
    }

    @Override
    public AtaqueInterface criarAtaque() {
        return new AtaqueForte();
    }

    @Override
    public AtaqueDecorator criarAtaqueDecorator(AtaqueInterface ataque) {
        return new AtaqueDecoratorFire(ataque);
    }

    @Override
    public CorrerInterface criarCorrer() {
        return new CorrerForte();
    }
    
    @Override
    public PuloInterface criarPulo() {
        return new PuloForte();
    }
    
    @Override
    public Escudo[] criarEscudo() {
        Escudo[] listaEscudos = {new EscudoEletricidade(), new EscudoFogo(), new EscudoGelo()};
        return listaEscudos;
    }
    
}
