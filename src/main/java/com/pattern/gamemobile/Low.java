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
public class Low implements Estado {

    @Override
    public void mover() {
        System.out.println("Corre devagar");
    }

    @Override
    public void atirar() {
        System.out.println("Atira devagar");
    }
    
}
