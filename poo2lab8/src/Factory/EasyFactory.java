/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Ataque.*;
import AtaqueDecorator.*;
import Correr.*;
import Enemy.*;
import Escudo.*;
import Personagem.*;
import Pulo.*;

/**
 *
 * @author vitor
 */
public class EasyFactory implements FactoryInterface{
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
    public Enemy criarEnemy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Escudo[] criarEscudo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona criarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PuloInterface criarPulo() {
        return new PuloForte();
    }
    
    
    
}
