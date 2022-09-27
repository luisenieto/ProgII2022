/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import docentes.modelos.Docente;
import docentes.modelos.NoDocente;
import docentes.modelos.Personal;
import espacios.modelos.Espacio;
import java.util.ArrayList;
import recursos.modelos.Recurso;
import turnos.modelos.Turno;

/**
 *
 * @author root
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Espacio> espacios = new ArrayList<>();
        ArrayList<Personal> personal = new ArrayList<>();
        
        Espacio e1 = new Espacio("1-3-01", 50, "Aula");
        Espacio e2 = new Espacio("1-3-01", 50, "Aula");
        
        if(!espacios.contains(e1))
            espacios.add(e1);
        if(!espacios.contains(e2))
            espacios.add(e2);
        
//        for(Espacio e : espacios) {
//            e.mostrar();
//        }
        
        Personal p1 = new Docente(1, "Apellido1", "Nombre1", 1, "Simple");
        Personal p2 = new Docente(2, "Apellido1", "Nombre1", 2, "Simple");
        Personal p3 = new NoDocente(3, "Apellido3", "Nombre3", 3);
        Personal p4 = new NoDocente(4, "Apellido1", "Nombre1", 4);
        
        if(!personal.contains(p1))
            personal.add(p1);
        if(!personal.contains(p2))
            personal.add(p2);
        if(!personal.contains(p3))
            personal.add(p3);
        if(!personal.contains(p4))
            personal.add(p4);
        
        for(Personal p : personal) {
            System.out.println(p.queSoy());
        }
        
        
    }
    
    
}
