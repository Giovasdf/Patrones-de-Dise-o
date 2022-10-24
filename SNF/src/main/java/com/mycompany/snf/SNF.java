/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.snf;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class SNF {

    /*1.	
    El sistema debe tener un acceso al sistema por medio de un correo electrónico y una contraseña. 
    */
    public static void main(String[] args) {
        FacadeLogging fc = new FacadeLogging();
        
        fc.getStartSesionOrEndSesion("Giovanni@iplacex.cl", "Iplacex","Logging");
        fc.getStartSesionOrEndSesion("Giovanni@iplacex.cl", "Iplacex","Logout");
        
        fc.getStartSesionOrEndSesion("", "","Logging");
        fc.getStartSesionOrEndSesion("", "","Logout");
        
    }
}
