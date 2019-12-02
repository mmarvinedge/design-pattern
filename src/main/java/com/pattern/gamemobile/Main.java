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
public class Main {

    public static void main(String[] args) {
        FactoryPersonagem personagemFactory = new FactoryPersonagem();
        Character character = new Character();
        DataBaseConnection.getInstance();
        try {
            Personagem p = personagemFactory.criarPersonagem("Barbaro");
            p.classe();
        } catch (PersonagemInexistenteException ex) {
            System.out.println("Classe não existente.");
        }

        character.atirar();
        character.mover();
        character.alvejado();
        character.sofrerDano(5);
        character.mover();
        character.atirar();
        character.vida();
        
        DataBaseConnection.getInstance();

    }
}
