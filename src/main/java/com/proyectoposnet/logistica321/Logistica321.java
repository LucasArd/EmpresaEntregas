/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectoposnet.logistica321;

/**
 *
 * @author luqas
 */
public class Logistica321 {

    public static void main(String[] args) {
        
        EmpresaLogistica empresa = new EmpresaLogistica("Mercado Envios");
        
        cargarEmpresa(empresa);
        
        empresa.repartirPaquetes();
        
    }
    public static void cargarEmpresa(EmpresaLogistica empresa){
        
        empresa.agregarTransportador(new CamionReparto("ABC132"));
        empresa.agregarTransportador(new CamionReparto("HJK543"));
        empresa.agregarTransportador(new CamionReparto("DFG322"));
        
        empresa.agregarTransportador(new DronEntregas("Samsung"));
        
        
    }
    
}
