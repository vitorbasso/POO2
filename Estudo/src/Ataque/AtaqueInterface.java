/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ataque;
import Personagem.Persona;

/**
 *
 * @author vitor
 */
public interface AtaqueInterface {
    public abstract void atacar(Persona persona);
    public abstract String getDescription();
    public abstract int getDano();
}
