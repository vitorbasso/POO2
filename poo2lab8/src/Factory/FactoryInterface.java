/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Ataque.AtaqueInterface;
import AtaqueDecorator.AtaqueDecorator;
import Correr.CorrerInterface;
import Enemy.Enemy;
import Escudo.Escudo;
import Personagem.Persona;
import Personagem.Persona1;
import Pulo.PuloInterface;
import Observer.Observable;
import Enemy.Enemy1;

/**
 *
 * @author vitor
 */
public abstract class FactoryInterface {
    
    
    public abstract AtaqueInterface criarAtaque();
    public abstract AtaqueDecorator criarAtaqueDecorator(AtaqueInterface ataque);
    public abstract CorrerInterface criarCorrer();
    public abstract PuloInterface criarPulo();
    public abstract Escudo[] criarEscudo();
    
    
    public Enemy criarEnemy(Observable observable, String nome){
        return new Enemy1(observable, nome);
    }
 
    public Persona criarPersona(String nome) {
        Persona personagem = new Persona1(nome, criarAtaque(), criarCorrer(),  criarPulo());
        Escudo[] lista = criarEscudo();
        for(int i = 0; i < lista.length; i++)
            personagem.addEscudo(lista[i]);
        personagem.setAtaque(criarAtaqueDecorator(personagem.getAtaque()));
        
        return personagem;
    }
}
