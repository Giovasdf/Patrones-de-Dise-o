/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.snf_api;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class SNF_API {

    /*
        2.	
        Al desplegar la información relacionada a un producto, el sistema debe mostrar los precios publicados por paginas relacionadas. 
        Esto se debe realizar a través de las APIs de los sitios web de las empresas competidoras.
    */
    
    public static void main(String[] args) {
        
        SNF_API apiPrincipal = new SNF_API();
        
        System.out.println("API 1");
        apiPrincipal.usarAPI1();
          System.out.println("API 2");
        apiPrincipal.usarAPI2();
          System.out.println("API 3");
        apiPrincipal.usarAPI3();
        
    }
    
    private void usarAPI1(){
        APIMain api = new API1();
        api.getAPI();
        api.postAPI();
    }
     private void usarAPI2(){
        APIMain api = new API2();
        api.getAPI();
        api.postAPI();
    }
      private void usarAPI3(){
        APIMain api = new API3Adapter();
        api.getAPI();
        api.postAPI();
    }
}
