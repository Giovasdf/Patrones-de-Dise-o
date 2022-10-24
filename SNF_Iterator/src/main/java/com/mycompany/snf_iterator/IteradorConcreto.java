/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snf_iterator;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class IteradorConcreto implements Iterador {
    
    private AgregadoConcreto agregado;
    private int posicion_actual = 0;

    public IteradorConcreto(AgregadoConcreto agregado) {
        this.agregado = agregado;
    }
    
    @Override
    public Producto primero(){
        
        Producto obj = null;
        if(this.agregado.productos.isEmpty() == false){
            this.posicion_actual = 0;
            obj = this.agregado.productos.firstElement();
        }
        return obj;
    
    }
    
    @Override
    public Producto siguiente(){
      Producto obj = null;
        if((this.posicion_actual) < this.agregado.productos.size()){
            obj = this.agregado.productos.elementAt(this.posicion_actual);
            this.posicion_actual += 1;
        }
        return obj;
    
    }
    
    @Override
    public boolean hayMas(){
        
        boolean ok = false;
        if(this.posicion_actual < ( this.agregado.productos.size() ) ){
            ok = true;
        }
        
        return ok;
    
    }
    
     @Override
    public Producto actual(){
        
        Producto obj = null;
        
        if(this.posicion_actual < this.agregado.productos.size()){
            
            obj = this.agregado.productos.elementAt(this.posicion_actual);
            
        }
        
        return obj;
    
    }
    
}
