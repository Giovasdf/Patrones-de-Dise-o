/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snf_api;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class API1 extends APIMain{
    
    public API1(){
        super();
        System.out.println("Creando API 1");
    }
    
    @Override
    public void getAPI(){
        System.out.println("Llamando API");
    }
    
    @Override
    public void postAPI(){
        System.out.println("Enviado Datos a API");
    }
    
    
}
