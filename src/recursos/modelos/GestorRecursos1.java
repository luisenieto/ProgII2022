/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.modelos;

import interfaces.IGestorRecursos;

/**
 *
 * @author root
 */
public class GestorRecursos1 implements IGestorRecursos {
    private static GestorRecursos1 instancia;
    
    private GestorRecursos1() {
        for(int i = 0; i < recursos.length; i++)
            recursos[i] = null;
    }
    
    Recurso[] recursos = new Recurso[100];

    public static GestorRecursos1 instanciar() {
        if (instancia == null)
            instancia = new GestorRecursos1();
        return instancia;
    }
    
    
    @Override
    public String nuevoRecurso(String nombre) {
        if (nombre != null) {
            if (!nombre.isEmpty()) {
                Recurso r = new Recurso(nombre);
                //...
                return IGestorRecursos.EXITO;
            }
            return IGestorRecursos.BLANCO;
        }
        return IGestorRecursos.NULO;
    }

    @Override
    public void mostrarRecursos() {
        for(int i = 0; i < recursos.length; i++) {
            Recurso recurso = recursos[i];
            if (recurso != null)
                recurso.mostrar();
            else
                break;
        }
    }
    
}
