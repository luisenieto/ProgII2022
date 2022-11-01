/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.modelos;

import interfaces.IGestorRecursos;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author root
 */
public class GestorRecursos3 implements IGestorRecursos {
    private Set<Recurso> recursos = new HashSet<>();
    
    private static GestorRecursos3 instancia;
    
    private GestorRecursos3() {
        
    }
    
    public static GestorRecursos3 instanciar() {
        if (instancia == null)
            instancia = new GestorRecursos3();
        return instancia;
    }

    @Override
    public String nuevoRecurso(String nombre) {
        if (nombre != null) {
            if (!nombre.isEmpty()) {
                Recurso r = new Recurso(nombre);
                if (this.recursos.add(r))
                    return IGestorRecursos.EXITO;
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
        for(Recurso r : this.recursos)
            r.mostrar();
    }
    
}
