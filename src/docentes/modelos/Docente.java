/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docentes.modelos;

import asignaturas.modelos.Asignatura;
import docentes.modelos.Personal;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Docente extends Personal {
    private String dedicacion;
    //private ArrayList<Asignatura> asignaturas = new ArrayList<>();

    public Docente(int legajo, String apellido, String nombre, int dni, String dedicacion) {
        super(legajo, apellido, nombre, dni);
        this.dedicacion = dedicacion;
        
    }
    
    
//    public Docente(int legajo, String apellido, String nombre, int dni, String dedicacion) {
//        this.legajo = legajo;
//        this.apellido = apellido;
//        this.nombre = nombre;
//        this.dni = dni;
//        this.dedicacion = dedicacion;
               
//    }
    
    
    
//    public void mostrar() {
//        System.out.println(apellido + ", " + nombre);
//        for(Asignatura a : this.asignaturas)
//            a.mostrar();
//    }
    
//    public void agregarAsignatura(Asignatura a) {
//        if (!this.asignaturas.contains(a)) {
//            this.asignaturas.add(a);
//            a.agregarDocente(this);
//        }
//    }



    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }
    
    
    @Override
    public void mostrar() {
        
        System.out.println(this.dedicacion);         
        super.mostrar();
    }

//    public ArrayList<Asignatura> getAsignaturas() {
//        return asignaturas;
//    }
//
//    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
//        this.asignaturas = asignaturas;
//    }

    @Override
    public String queSoy() {
        return "Soy un docente";
    }
    
    
}
