/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snf;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class FacadeLogging {
    
    public void getStartSesionOrEndSesion(String user, String password, String operation){
        
        System.out.println("Se esta usando la fachada para: "+operation);
        Logging logging = new Logging(user,password,operation);
        System.out.println("Resultado de la fachada: "+ logging.operation());
    
    }
    
}
