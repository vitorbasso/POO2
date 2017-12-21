/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09poo2;

/**
 *
 * @author vitor
 */
public class Mario {
    
    private Estado capaEstado;
    private Estado fogoEstado;
    private Estado grandeEstado;
    private Estado pequenoEstado;
    
    private Estado estado;
    
    private int pontos;
    
    public Mario(){
        capaEstado = new Capa(this);
        fogoEstado = new Fogo(this);
        grandeEstado = new Grande(this);
        pequenoEstado = new Pequeno(this);
        
        estado = pequenoEstado;
        
        pontos = 0;
    }
    
    public void pegarCogumelo(){
        estado.pegarCogumelo();
    }
    
    public void pegarFlor(){
        estado.pegarFlor();
    }
    
    public void pegarCapa(){
        estado.pegarCapa();
    }
    
    public void levarDano(){
        estado.levarDano();
    }
    
    public Estado getEstado(){
        return estado;
    }
    
    public void setEstado(Estado estado){
        this.estado = estado;
    }
    
    public Estado getCapaEstado(){
        return capaEstado;
    }
    
    public Estado getFogoEstado(){
        return fogoEstado;
    }
    
    public Estado getGrandeEstado(){
        return grandeEstado;
    }
    
    public Estado getPequenoEstado(){
        return pequenoEstado;
    }
    
    public void addPontos(int pontos){
        this.pontos += pontos;
    }
    
}
