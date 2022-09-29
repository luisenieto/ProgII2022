/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docentes.modelos;

import asignaturas.modelos.Asignatura;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Docente {
    private int legajo;
    private String apellido;
    private String nombre;
    private int dni;
    private Dedicacion dedicacion;    
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();

    public Docente(int legajo, String apellido, String nombre, int dni, Dedicacion dedicacion) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.dedicacion = dedicacion;
    }
    
    
    
    public void mostrar() {
        System.out.println(apellido + ", " + nombre + ", " + this.dedicacion);
        for(Asignatura a : this.asignaturas)
            a.mostrar();
    }
    
    public void agregarAsignatura(Asignatura a) {
        if (!this.asignaturas.contains(a)) {
            this.asignaturas.add(a);
            a.agregarDocente(this);
        }
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Dedicacion getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(Dedicacion dedicacion) {
        this.dedicacion = dedicacion;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
