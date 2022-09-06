/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docentes.modelos;

/**
 *
 * @author root
 */
public class Docente {
    int legajo;
    String apellido;
    String nombre;
    int dni;
    String dedicacion;
    
    void mostrar() {
        System.out.println(apellido + ", " + nombre);
        System.out.println(dni);
    }
}
