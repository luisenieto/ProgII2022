/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import asignaturas.modelos.Asignatura;
import docentes.modelos.Docente;
import espacios.modelos.Espacio;
import recursos.modelos.Composicion;
import recursos.modelos.Recurso;

/**
 *
 * @author root
 */
public class Main {
    public static void main(String[] args) {
        
        Espacio e1 = new Espacio("1-3-01", 50, "Aula");
        
        Recurso r1 = new Recurso("Pantalla");
        Composicion c1 = new Composicion(r1, 1);
        e1.agregarRecurso(c1);
        
        Recurso r2 = new Recurso("Ventilador");
        Composicion c2 = new Composicion(r2, 5);
        e1.agregarRecurso(c2);
        
        e1.mostrar();
        
//        Espacio e2 = new Espacio("1-3-15", 1550);
//        Espacio e3 = new Espacio("4-3-15");
        //e1.nombre = null;
        //e1.capacidad = -50;
        //e1.tipo = null;
        
        //e1.mostrar1();
        //e1.asignarNombre("1-3-01");
        //e1.verNombre();
        
//        e1.asignarNombre("1-3-14");
//        e1.asignarCapacidad(-10);
//        e1.asignarTipo("Aula");

//        e1.asignarNombre("A1");
//        e3.mostrar();

//        Docente d1 = new Docente(1, "Pérez", "Juan", 1, "Simple");
//        Docente d2 = new Docente(1, "Pérez", "Juan", 1, "Simple");
//        if (d1 == d2)
//            System.out.println("Iguales");
//        else
//            System.out.println("Distintoss");
        //d.mostrar();
        
        //Asignatura a = new Asignatura("E11", "Programación II");
        //a.mostrar();
        
        //d.agregarAsignatura(a);
        //d.mostrar();
        //a.agregarDocente(d);
        
        //a.mostrar();
        //d.mostrar();
        
        
    }
    
    
}
