/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import espacios.modelos.Espacio;
import java.util.Comparator;

/**
 *
 * @author root
 */
public interface IGestorEspacios {
    public static final String EXITO = "Se pudo crear el espacio";
    public static final String REPETIDO = "Ya existe un espacio con ese nombre";
    public static final String BLANCO = "No se puede crear un espacio con nombre/tipo en blanco, o capacidad negativa";
    public static final String NULO = "No se puede crear un espacio sin nombre o sin tipo";
    
    public abstract String nuevoEspacio(String nombre, int capacidad, String tipo);
    public abstract void mostrarEspacios(Comparator<Espacio> cmp);
}
