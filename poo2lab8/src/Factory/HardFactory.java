/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Ataque.AtaqueInterface;
import Ataque.AtaqueFraco;
import AtaqueDecorator.AtaqueDecorator;
import AtaqueDecorator.AtaqueDecoratorBolt;
import Correr.CorrerInterface;
import Correr.CorrerFraco;
import Escudo.Escudo;
import Escudo.EscudoEletricidade;
import Pulo.PuloInterface;
import Pulo.PuloFraco;

/**
 *
 * @author vitor
 */
public class HardFactory extends FactoryInterface{
    
    private static HardFactory uniqueInstance = null;
    
    private HardFactory(){}
    
    public static HardFactory getInstance(){
        if(uniqueInstance == null){
            synchronized(HardFactory.class){
                if(uniqueInstance == null){
                    uniqueInstance = new HardFactory();
                }
            }
        }
        return uniqueInstance;
    }

    @Override
    public AtaqueInterface criarAtaque() {
       return new AtaqueFraco();
    }

    @Override
    public AtaqueDecorator criarAtaqueDecorator(AtaqueInterface ataque) {
        return new AtaqueDecoratorBolt(ataque);
    }

    @Override
    public CorrerInterface criarCorrer() {
        return new CorrerFraco();
    }

    @Override
    public PuloInterface criarPulo() {
        return new PuloFraco();
    }

    @Override
    public Escudo[] criarEscudo() {
        Escudo[] listaEscudos = {new EscudoEletricidade()};
        return listaEscudos;
    }
    
    
    
}
