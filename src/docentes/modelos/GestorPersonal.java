/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docentes.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class GestorPersonal {
    List<Personal> personal = new ArrayList<>();
    
    
    public void nuevoPersonal(int legajo, String apellido, String nombre, int dni, String dedicacion) {
        Personal p = new Docente(legajo, apellido, nombre, dni, dedicacion);
        this.personal.add(p);
    }
    
    public void nuevoPersonal(int legajo, String apellido, String nombre, int dni) {
        Personal p = new NoDocente(legajo, apellido, nombre, dni);
        this.personal.add(p);
    }
    
    public Docente buscar(String dedicacion) {
        for(Personal p : this.personal){
            if (p instanceof Docente) {
                Docente d = (Docente)p;
                if (d.getDedicacion().equals(dedicacion))
                    return d;
            }
        }
        return null;
    }
}
