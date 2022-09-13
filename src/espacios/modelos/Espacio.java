/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espacios.modelos;

import java.time.LocalDate;

/**
 *
 * @author root
 */
public class Espacio {
    private String nombre;
    private int capacidad;
    private String tipo;

    public Espacio(String nombre, int capacidad, String tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;        
    }
    
    public Espacio(String n, int c) {        
        nombre = n;
        capacidad = c;
    }
    
    public Espacio(String n) {
        this();
    }
    
    public Espacio() {
        
    }
    
   
    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public int verCapacidad() {
        return capacidad;
    }

    public void asignarCapacidad(int capacidad) {
        if (capacidad > 0)
            this.capacidad = capacidad;
    }

    public String verTipo() {
        return tipo;
    }

    /**
     * Permite asignar el tipo a un espacio
     * @param tipo tipo del espacio
     */
    public void asignarTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Permite ver un espacio
     */
    public void mostrar() {
        System.out.println(nombre);
        System.out.println(capacidad);
        System.out.println(tipo);
    }
    
    /**
     * 
     * Hace ....
     * @return devuelve un entero ....
     */
    public void metodo1() {
        this.metodo2();
    }
    
    public void metodo2() {
        
    }
}
