/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snf_observer;

import com.mycompany.snf_observer.Producto.EstadoEvent;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author giovannimolinagalleguillos
 */
class ProductoObservable implements Observer{
    
    @Override
    @SuppressWarnings("unchecked")
    
    public void update(Observable observable, Object args){
        if(args instanceof EstadoEvent){
            EstadoEvent evento = (EstadoEvent) args;
            System.out.println("El estado a cambiado de "+evento.getEstadoAntiguo()+ " a "+ evento.getEstadoNuevo() + "lo recibira en 2 días habíles");
        }
    }
    
}
