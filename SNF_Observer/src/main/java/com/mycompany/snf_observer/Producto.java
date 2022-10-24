/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snf_observer;
import java.util.Observable;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class Producto {
    
    public class EstadoEvent{
       
        private Producto producto;
        private String estadoAntiguo;
        private String estadoNuevo;

        public EstadoEvent(Producto producto, String estadoAntiguo, String estadoNuevo) {
            this.producto = producto;
            this.estadoAntiguo = estadoAntiguo;
            this.estadoNuevo = estadoNuevo;
        }

        public Producto getProducto() {
            return producto;
        }

        public String getEstadoAntiguo() {
            return estadoAntiguo;
        }

        public String getEstadoNuevo() {
            return estadoNuevo;
        }
        
       

        
    }
    
    private static final ProductoObservable OBSERVABLE;
    
    private String nombre;
    private String Estado;
    
    static {
        OBSERVABLE = new ProductoObservable();
    }
    


    public Producto(String nombre, String Estado) {
        this.nombre = nombre;
        this.Estado = Estado;
    }

    public static ProductoObservable getOBSERVABLE() {
        return OBSERVABLE;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return Estado;
    }
    
    public void setEstado(String estado){
        
        EstadoEvent event = new EstadoEvent(this, this.Estado,estado);
        this.Estado = estado;
        synchronized(OBSERVABLE){
            OBSERVABLE.setChanged();
            OBSERVABLE.notifyObservers(event);
        }
        
    
    }
    
    public static class ProductoObservable extends Observable{
        @Override
        public synchronized void setChanged(){
            super.setChanged();
        }
    }
    
    
    
}
