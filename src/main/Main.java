/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import espacios.modelos.Espacio;
import recursos.modelos.Recurso;

/**
 *
 * @author root
 */
public class Main {
    public static void main(String[] args) {
        Recurso r1 = new Recurso();
        Recurso r2 = new Recurso();
        r1.mostrar();
        r2.mostrar();
        Espacio e1 = new Espacio();
        
        e1.mostrar1();
    }
    
    
}
