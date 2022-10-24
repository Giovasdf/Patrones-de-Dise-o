/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snf;

import java.util.logging.Logger;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class Logging {
    
    String operation = null;
    String user = null;
    String password = null;

 
    public Logging(String _user, String _password, String _operation) {
        
        this.user = _user;
        this.password = _password;
        this.operation = _operation;
        
    }
    
    public String operation(){
        
        String isLogging = null;
        
        if(operation.equals("Logging")){
            
            SignIn signIn = new SignIn();
            isLogging = signIn.startSesion(user,password);
            
        }
        
        if(operation.equals("Logout")){
            
            Logout logout = new Logout();
            isLogging = logout.endSesion(user,password);
            
        }
    
        return isLogging;
    }
}
   
    
    
    

