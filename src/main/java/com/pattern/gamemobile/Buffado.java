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
public class Buffado implements Estado {

    @Override
    public void mover() {
        System.out.println("Corre rápido");
    }

    @Override
    public void atirar() {
        System.out.println("Atira rápido");
    }
    
}
