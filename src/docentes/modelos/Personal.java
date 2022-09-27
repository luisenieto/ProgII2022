/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docentes.modelos;

import java.util.Objects;

/**
 *
 * @author root
 */
public abstract class Personal {
    private int legajo;
    private String apellido;
    private String nombre;
    private int dni;

       
    public Personal(int legajo, String apellido, String nombre, int dni) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public int hashCode() {        
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.apellido);
        hash = 61 * hash + Objects.hashCode(this.nombre);
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
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Personal other = (Personal) obj;
        if (!this.apellido.equalsIgnoreCase(other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
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
    
    public void mostrar() {
        System.out.println(this.legajo + ", " + this.apellido + ", " + this.nombre + ", " + this.dni);
    }
    
    public String queSoy() {
        return "sasa";
    };
}
