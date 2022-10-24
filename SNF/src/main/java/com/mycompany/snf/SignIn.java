/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snf;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class SignIn {
    
    private boolean _login(String user, String password){
        
        return !(user.equalsIgnoreCase("") || password.equalsIgnoreCase(""));
    
    } 
    
    public String startSesion(String user, String password){
        
        if(_login(user,password)){
            return "Inicio de Sesion Exitoso";
        }
        else{
            return "Inicio de Sesion Fallido";
        }
    
    }
    
    
}
