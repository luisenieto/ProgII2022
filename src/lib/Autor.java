/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author root
 */
public class Autor {
    private int dni;

    public Autor(int dni) {
        this.dni = dni;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.dni;
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
        final Autor other = (Autor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Autor p1 = new Profesor(1);
        Autor p2 = new Profesor(2);
        if (p1.equals(p2))
            System.out.println("Profesores iguales");
        else
            System.out.println("Profesores distintos");
        
        Autor a1 = new Alumno(10, "10");
        Autor a2 = new Alumno(20, "20");
        
        if (a1.equals(a2))
            System.out.println("Alumnos iguales");
        else
            System.out.println("Alumnos distintos");
    }
}
