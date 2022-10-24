package com.mycompany.snf_iterator;

import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giovannimolinagalleguillos
 */
public class AgregadoConcreto implements Agregado {
    
    protected Vector<Producto> productos = new Vector<Producto>();
    
    public AgregadoConcreto(){
        this.llenar();
    }
    
    @Override
    public Iterador getIterador(){
        return new IteradorConcreto(this);
    }
    
    public void llenar(){
        Producto producto1 = new Producto("Servicio1",20);
        Producto producto2 = new Producto("Servicio2",10);
        Producto producto3 = new Producto("Servicio3",15);

        this.productos.add(producto1);
        this.productos.add(producto2);
        this.productos.add(producto3);

            
    }
    
    public void agregarProducto(Producto p){
        
        this.productos.add(p);
    }
    
}
