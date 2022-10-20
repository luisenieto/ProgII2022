/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.modelos;

import interfaces.IGestorRecursos;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class GestorRecursos2 implements IGestorRecursos {
    private ArrayList<Recurso> recursos = new ArrayList<>();
    
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
    
    public void mostrarRecursos() {
        for(Recurso r : this.recursos)
            r.mostrar();
    }
}
