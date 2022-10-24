/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.snf_iterator;

import java.util.Scanner;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class SNF_Iterator {

    public static void main(String[] args) {
        try{
            int valorTotal = 0;
            AgregadoConcreto agregado = new AgregadoConcreto();
            Iterador iterador = agregado.getIterador();
            Scanner scan= new Scanner(System.in);

            System.out.println("Bienvenido");
            
            System.out.println("Usted a contratado los siguientes servicios");
            Producto obj = null;
            
            String text = "Y";
            Producto productoNuevo = new Producto();
            while(text.equalsIgnoreCase("Y")){
                
                System.out.println("Desea Agregar otro servicio? (Y/N)");
                text = scan.nextLine();
                
                if(text.equalsIgnoreCase("Y")){
                    System.out.println("Ingrese Nombre");
                    productoNuevo.setNombre(scan.nextLine());
                    
                    System.out.println("Ingrese Precio");
                    productoNuevo.setPrecio(scan.nextInt());
                    
                    agregado.agregarProducto(productoNuevo);
                    
                }
                
            }

            while(iterador.hayMas() == true){
                obj = iterador.siguiente();
                valorTotal += obj.getPrecio();
            }
            System.out.println("El total es: "+valorTotal+" UF");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
