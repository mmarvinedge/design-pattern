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
public class FactoryPersonagem  {

    public Personagem criarPersonagem(String classe) throws PersonagemInexistenteException {

        if (classe.equalsIgnoreCase("arqueiro")) {
            return new Arqueiro();
        }
        if (classe.equalsIgnoreCase("barbaro")) {
            return new Barbaro();
        }
        if (classe.equalsIgnoreCase("barbaro")) {
            return new Guerreiro();
        }
        
        throw new PersonagemInexistenteException();
    }
}
