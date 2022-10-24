/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snf;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class Logout {
    
      
    public boolean _logout(String user, String password){
        
          
        return !(user.equalsIgnoreCase("") || password.equalsIgnoreCase(""));    
    } 
    
    public String endSesion(String user, String password){
        
        if(_logout(user,password)){
            return "Cierre de Sesion Exitoso";
        }
        else{
            return "Cierre de Sesion Fallido";
        }
    
    }
    
}
