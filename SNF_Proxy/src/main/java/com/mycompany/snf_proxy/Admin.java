/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snf_proxy;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class Admin {
    
    public ItemBuilder itemBuilder;
    
    public void setItemBuilder(ItemBuilder ib){
        itemBuilder = ib;
        System.out.println("Creando item:"+ib);
    }
    
    public Item getItem(){
        return itemBuilder.getItem();
    }
    
    public void construirItem(){
        itemBuilder.crearNuevoItem();
        itemBuilder.buildTipo();

    }
    
}
