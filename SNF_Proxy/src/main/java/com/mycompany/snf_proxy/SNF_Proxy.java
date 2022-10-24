/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.snf_proxy;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class SNF_Proxy {

    public static void main(String[] args) {
        Admin admin = new Admin();
        ItemBuilder productoBuilder = new ProductoBuilder();
        ItemBuilder categoriaBuilder = new CategoriaBuilder();
            
        admin.setItemBuilder(categoriaBuilder);
        admin.construirItem();
        
        admin.setItemBuilder(productoBuilder);
        admin.construirItem();
        
        Item item = admin.getItem();
        
        System.out.println(item);
            
        
    }
}
