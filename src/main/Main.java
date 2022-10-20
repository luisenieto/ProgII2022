/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import interfaces.IGestorRecursos;
import recursos.modelos.GestorRecursos1;
import recursos.modelos.GestorRecursos2;

/**
 *
 * @author root
 */
public class Main {
    public static void main(String[] args) {
        IGestorRecursos gr1 = GestorRecursos2.instanciar();
//        GestorRecursos gr2 = GestorRecursos.instanciar();
//        GestorRecursos gr3 = gr1;
//        
        System.out.println(gr1.nuevoRecurso("Ventilador"));
        System.out.println(gr1.nuevoRecurso("Ventilador"));
        System.out.println(gr1.nuevoRecurso("Pantalla"));
        System.out.println(gr1.nuevoRecurso(null));
        System.out.println(gr1.nuevoRecurso(""));
//        
        String resultado = gr1.nuevoRecurso("Proyector");
        if (resultado.equals(GestorRecursos1.EXITO))
            System.out.println("dsdsd");
        
        gr1.mostrarRecursos();
        
        
    }        
}
