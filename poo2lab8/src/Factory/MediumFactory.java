/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;
import Ataque.AtaqueInterface;
import Ataque.AtaqueMedio;
import AtaqueDecorator.AtaqueDecorator;
import AtaqueDecorator.AtaqueDecoratorIce;
import Correr.CorrerInterface;
import Correr.CorrerMedio;
import Escudo.*;
import Pulo.PuloInterface;
import Pulo.PuloMedio;

/**
 *
 * @author vitor
 */
public class MediumFactory extends FactoryInterface{
    
    private static MediumFactory uniqueInstance = null;
    
    private MediumFactory(){}
    
    public static MediumFactory getInstance(){
        if(uniqueInstance == null){
            synchronized(MediumFactory.class){
                if(uniqueInstance == null){
                    uniqueInstance = new MediumFactory();
                }
            }
        }
        return uniqueInstance;
    }

    @Override
    public AtaqueInterface criarAtaque() {
        return new AtaqueMedio();
    }

    @Override
    public AtaqueDecorator criarAtaqueDecorator(AtaqueInterface ataque) {
        return new AtaqueDecoratorIce(ataque);
    }

    @Override
    public CorrerInterface criarCorrer() {
        return new CorrerMedio();
    }

    @Override
    public PuloInterface criarPulo() {
        return new PuloMedio();
    }

    @Override
    public Escudo[] criarEscudo() {
        Escudo[] listaEscudos = {new EscudoEletricidade(), new EscudoGelo()};
        return listaEscudos;
    }
    
    
    
}
