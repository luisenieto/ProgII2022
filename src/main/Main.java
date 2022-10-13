/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import recursos.modelos.GestorRecursos;
import recursos.modelos.Recurso;

/**
 *
 * @author root
 */
public class Main {
    public static void main(String[] args) {
        GestorRecursos gr1 = GestorRecursos.instanciar();
        GestorRecursos gr2 = GestorRecursos.instanciar();
        GestorRecursos gr3 = gr1;
        
        System.out.println(gr1.nuevoRecurso("Ventilador"));
        System.out.println(gr1.nuevoRecurso("Ventilador"));
        System.out.println(gr2.nuevoRecurso("Pantalla"));
        System.out.println(gr1.nuevoRecurso(null));
        System.out.println(gr1.nuevoRecurso(""));
        
        String resultado = gr1.nuevoRecurso("Proyector");
        if (resultado.equals(GestorRecursos.EXITO))
            System.out.println("dsdsd");
        
        gr3.mostrarRecursos();
        
        
    }        
}
