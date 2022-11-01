/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.modelos;

import java.util.Objects;

/**
 *
 * @author root
 */
public class Recurso implements Comparable<Recurso> {
    private String nombre;
    
    public void mostrar() {
        System.out.println(nombre);
    }

    public Recurso(String nombre) {
        this.nombre = nombre;        
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode");
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals");
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recurso other = (Recurso) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public int compareTo(Recurso arg0) {
        return this.nombre.compareTo(arg0.nombre) * (-1);
    }

    
    
    
}
