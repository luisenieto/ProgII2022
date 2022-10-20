/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author root
 */
public interface IGestorRecursos {
    String EXITO = "Se pudo crear el recurso";
    public static final String REPETIDO = "Ya existe un recurso con ese nombre";
    public static final String BLANCO = "No se puede crear un recurso con nombre en blanco";
    public static final String NULO = "No se puede crear un recurso sin nombre";
    
    String nuevoRecurso(String nombre);
    void mostrarRecursos();
}
