/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espacios.modelos;

import interfaces.IGestorEspacios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author root
 */
public class GestorEspacios implements IGestorEspacios {
    private List<Espacio> espacios = new ArrayList<>();
    private static GestorEspacios instancia;
    
    private GestorEspacios() {
        
    }
    
    public static GestorEspacios instanciar() {
        if (instancia == null)
            instancia = new GestorEspacios();
        return instancia;
    }
    
        
    @Override
    public String nuevoEspacio(String nombre, int capacidad, String tipo) {
        if (nombre != null && tipo != null) {
            if (!nombre.isEmpty() && !tipo.isEmpty() && capacidad > 0) {
                Espacio e = new Espacio(nombre, capacidad, tipo);
                if (!this.espacios.contains(e)) {
                    this.espacios.add(e);
                    return IGestorEspacios.EXITO;
                }
                else
                    return IGestorEspacios.REPETIDO;
            }
            else
                return IGestorEspacios.BLANCO;
        }
        else
            return IGestorEspacios.NULO;
    }

    @Override
    public void mostrarEspacios(Comparator<Espacio> cmp) {
        Collections.sort(this.espacios, cmp);
        for(Espacio e : this.espacios) {
            e.mostrar();
        }        
    }
}
