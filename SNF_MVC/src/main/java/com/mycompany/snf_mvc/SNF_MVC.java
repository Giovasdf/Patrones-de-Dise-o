/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.snf_mvc;

import Controladores.ControladorEmpresa;
import Modelos.Empresa;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class SNF_MVC {

    public static void main(String[] args) {
        ControladorEmpresa empresa = new ControladorEmpresa();
        Empresa nuevaEmpresa = new Empresa("Empresa1","Direccion2","+5350830778943");
        empresa.AgregarEmpresa(nuevaEmpresa);
        
        var empresaTemp = empresa.BuscarEmpresaXNombre("Empresa1");
        
        System.out.println("Empresa encontrada: "+empresaTemp.getNombre());
        
    }
}
