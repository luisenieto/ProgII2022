/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.modelos;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class GestorRecursos {
    private ArrayList<Recurso> recursos = new ArrayList<>();
    public static final String EXITO = "Se pudo crear el recurso";
    public static final String REPETIDO = "Ya existe un recurso con ese nombre";
    public static final String BLANCO = "No se puede crear un recurso con nombre en blanco";
    public static final String NULO = "No se puede crear un recurso sin nombre";
    
    private static GestorRecursos instancia;
    
    private GestorRecursos() {
        
    }
    
    public static GestorRecursos instanciar() {
        if (instancia == null)
            instancia = new GestorRecursos();
        return instancia;
    }
    
    public String nuevoRecurso(String nombre) {
        if (nombre != null) {
            if (!nombre.isEmpty()) {
                Recurso r = new Recurso(nombre);
                if (!this.recursos.contains(r)) {
                    this.recursos.add(r);  
                    return EXITO;
                }
                else
                    return REPETIDO;
            }
            else
                return BLANCO;
        }
        else
            return NULO;
    }
    
    public void mostrarRecursos() {
        for(Recurso r : this.recursos)
            r.mostrar();
    }
}
