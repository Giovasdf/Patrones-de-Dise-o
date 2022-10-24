/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snf_api;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class API3Adapter extends APIMain {
    
    private API3 api3;
    
    public API3Adapter(){
        super();
        this.api3 = new API3();
        System.out.println("Creando API 3");
    }
    
    @Override
    public void getAPI(){
        System.out.println("Llamando API");
        this.api3.obtenerSOAP();
        this.api3.convertirSoapAJson();
    }
    
    @Override
    public void postAPI(){
        System.out.println("Enviado Datos a API");
        this.api3.postAPI();
        this.api3.convertirJsonASoap();
    }
   
    
}
