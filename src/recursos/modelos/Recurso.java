/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.modelos;

/**
 *
 * @author root
 */
public class Recurso {
    String nombre;
    
    public void mostrar() {
        System.out.println(nombre);
    }

    public Recurso(String nombre) {
        this.nombre = nombre;
    }
    
    
}
