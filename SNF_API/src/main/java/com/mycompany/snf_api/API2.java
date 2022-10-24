/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snf_api;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class API2 extends APIMain{
    
    public API2(){
        super();
        System.out.println("Creando API 2");
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
