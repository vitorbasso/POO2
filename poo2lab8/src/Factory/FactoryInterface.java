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
public interface FactoryInterface {
    public abstract AtaqueInterface criarAtaque();
    public abstract AtaqueDecorator criarAtaqueDecorator(AtaqueInterface ataque);
    public abstract CorrerInterface criarCorrer();
    public abstract Enemy criarEnemy();
    public abstract Escudo[] criarEscudo();
    public abstract Persona criarPersona(String nome);
    public abstract PuloInterface criarPulo();
}
