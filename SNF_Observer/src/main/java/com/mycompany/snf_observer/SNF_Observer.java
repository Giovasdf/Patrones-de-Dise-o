/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.snf_observer;

import java.util.Observer;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class SNF_Observer {

    public static void main(String[] args) {
        Producto p1 = new Producto("Encomienda1","Por salir a despacho");
        
        Observer ol = new ProductoObservable();
        Producto.getOBSERVABLE().addObserver(ol);
        
        p1.setEstado("En ruta");
        
        
    }


}
