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
public class DataBaseConnection {
    private static DataBaseConnection instance = null;
    
    private DataBaseConnection () {
        
    }
    
    public static DataBaseConnection getInstance () {
        if(instance == null) {
            instance = new DataBaseConnection();
            System.out.println("Criou Instância");
        }
        
        return instance;
    }
}
