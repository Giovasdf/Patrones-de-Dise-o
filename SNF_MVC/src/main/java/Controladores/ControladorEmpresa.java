/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Empresa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giovannimolinagalleguillos
 */
public class ControladorEmpresa {
    
    private final List<Empresa> listaEmpresa = new ArrayList<Empresa>();
    
    public String AgregarEmpresa(Empresa e){
        this.listaEmpresa.add(e);
        return "Empresa Agregada";
    }
    
    public String EliminarEmpresa(Empresa e){
        this.listaEmpresa.remove(e);
        return "Empresa Eliminada ";
    }
    
    public Empresa BuscarEmpresaXNombre(String nombre){
        Empresa empresa = null;
        for(int i = 0; i<this.listaEmpresa.size(); i++){
            
            empresa = this.listaEmpresa.get(i);
            
            if(empresa.nombre.equals(nombre)){
                return empresa;
            }
            
        }
        
        return empresa;
        
    }
    
}
