/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.util.Objects;

/**
 *
 * @author root
 */
public class Alumno extends Autor {
    private String cx;

    public Alumno(int dni, String cx) {
        super(dni);
        this.cx = cx;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.cx);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if (super.equals(obj))
           return true;
       else {
           if (obj instanceof Alumno) {
                final Alumno a = (Alumno)obj;
                return this.cx.equals(a.cx);
           }
           else
               return false;
       }
    }
    
    
}
