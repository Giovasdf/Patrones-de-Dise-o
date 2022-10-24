/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snf_proxy;

/**
 *
 * @author giovannimolinagalleguillos
 */
public abstract class ItemBuilder {
    
    protected Item item;
    
    public Item getItem(){
        return item;
    }
    
    public void crearNuevoItem(){
        
        item = new Item();
        
    }
    
    public abstract void buildTipo();
    
}
