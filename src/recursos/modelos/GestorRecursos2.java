/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.modelos;

import interfaces.IGestorRecursos;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author root
 */
public class GestorRecursos2 implements IGestorRecursos {
    private List<Recurso> recursos;// = new LinkedList<>();
    
    private static GestorRecursos2 instancia;
    
    private GestorRecursos2() {
        
    }
    
    public static GestorRecursos2 instanciar() {
        if (instancia == null)
            instancia = new GestorRecursos2();
        return instancia;
    }
    
    public String nuevoRecurso(String nombre) {
        if (nombre != null) {
            if (!nombre.isEmpty()) {
                Recurso r = new Recurso(nombre);
                
                    if (!this.recursos.contains(r)) {
                        this.recursos.add(r);
                        return IGestorRecursos.EXITO;
                    }
                    else
                        return IGestorRecursos.REPETIDO;
                
            }
            else
                return IGestorRecursos.BLANCO;
        }
        else
            return IGestorRecursos.NULO;
    }
    
    @Override
    public void mostrarRecursos() {
        Collections.sort(this.recursos);
//        this.recursos.sort(c);
        for(Recurso r : this.recursos)
            r.mostrar();
    }
}
