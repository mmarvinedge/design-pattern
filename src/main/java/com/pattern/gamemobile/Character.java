/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.gamemobile;

/**
 *
 * @author Usuário
 */
public class Character {
    
    private Estado estado = new Normal();
    private int life = 100;
    
    public void atirar(){
        this.estado.atirar();
    }
    
    public void mover(){
        this.estado.mover();
    }
    
    public void alvejado(){
        this.estado = new Low();
    }
    
    public void sofrerDano(int dano){
        this.life -= dano;
        
        if(life < 10) {
            this.estado = new Low();
        }
    }
    
    public void vida(){
        System.out.println("Life: " + life);
    }
    
    public void curar(int cura){
        this.life += cura;
    }
    
    public void buff(){
        this.estado = new Buffado();
    }
    
}
