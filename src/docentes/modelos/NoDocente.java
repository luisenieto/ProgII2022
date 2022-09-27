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
public class NoDocente extends Personal {
    
    public NoDocente(int legajo, String apellido, String nombre, int dni) {
        super(legajo, apellido, nombre, dni);
    }
    
    @Override
    public String queSoy() {
        return "Soy un no docente";
    }
}
