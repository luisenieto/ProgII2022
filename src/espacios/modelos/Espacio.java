/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espacios.modelos;

import java.util.ArrayList;
import java.util.Objects;
import recursos.modelos.Composicion;
import recursos.modelos.Recurso;

/**
 *
 * @author root
 */
public class Espacio {
    private String nombre;
    private int capacidad;
    private String tipo;
    private ArrayList<Composicion> recursos = new ArrayList<>();
    

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
//        for(Composicion c : this.recursos) {
//            c.getRecurso().mostrar();
//            System.out.println(c.getCantidad());
//        }
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
    
    public void agregarRecurso(Composicion c) {
        this.recursos.add(c);
    }
    
    public String toString() {
        return this.nombre + " (" + this.capacidad + ") " + this.tipo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Espacio other = (Espacio) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}
