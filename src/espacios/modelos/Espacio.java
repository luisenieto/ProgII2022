/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espacios.modelos;

import java.time.LocalDate;

/**
 *
 * @author root
 */
public class Espacio {
    public String nombre;
    int capacidad;
    String tipo;
    LocalDate inhabilitadoDesde;
    LocalDate inhabilitadoHasta;
    
    public void mostrar1() {
        int x = 0;
        System.out.println(nombre);
        System.out.println(capacidad);
        System.out.println(tipo);
        System.out.println(x);
    }
            
    public void mostrar2() {
        int x;
        System.out.println(nombre);
        System.out.println(capacidad);
        System.out.println(tipo);
    }       
    
}
