/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

//import espacios.modelos.CapacidadComparator;
//import espacios.modelos.NombreComparator;
import espacios.modelos.Espacio;
import espacios.modelos.GestorEspacios;
import interfaces.IGestorEspacios;
import interfaces.IGestorRecursos;
import java.util.Comparator;
import recursos.modelos.GestorRecursos2;

/**
 *
 * @author root
 */
public class Main {
    public static void main(String[] args) {
        IGestorRecursos gr1 = GestorRecursos2.instanciar();
        IGestorEspacios ge = GestorEspacios.instanciar();
//        GestorRecursos gr2 = GestorRecursos.instanciar();
//        GestorRecursos gr3 = gr1;
//        
        System.out.println(gr1.nuevoRecurso("Ventilador"));
        System.out.println(gr1.nuevoRecurso("Ventilador"));
        System.out.println(gr1.nuevoRecurso("Pantalla"));
        System.out.println(gr1.nuevoRecurso(null));
        System.out.println(gr1.nuevoRecurso(""));
//        
//        String resultado = gr1.nuevoRecurso("Proyector");
//        if (resultado.equals(GestorRecursos1.EXITO))
//            System.out.println("dsdsd");
        
//        gr1.mostrarRecursos();
        
        System.out.println(ge.nuevoEspacio("1-3-15", 50, "Aula"));
        System.out.println(ge.nuevoEspacio("1-3-14", 100, "Aula"));
        System.out.println(ge.nuevoEspacio("1-3-14", 100, "Aula"));
        System.out.println(ge.nuevoEspacio("1-3-15", 0, "Aula"));
        System.out.println(ge.nuevoEspacio("1-3-15", 50, ""));
        System.out.println(ge.nuevoEspacio("1-3-15", 50, null));
        System.out.println(ge.nuevoEspacio(null, 50, "Aula"));
        
        //ge.mostrarEspacios(new NombreComparator());
        //ge.mostrarEspacios(new CapacidadComparator());
        
//        Comparator<Espacio> cmp = new Comparator<Espacio>() {
//            @Override
//            public int compare(Espacio arg0, Espacio arg1) {
//                return arg0.verNombre().compareTo(arg1.verNombre());
//            }
//        };
//        ge.mostrarEspacios(cmp);
//        
//        cmp = new Comparator<Espacio>() {
//            @Override
//            public int compare(Espacio arg0, Espacio arg1) {
//                return arg0.verCapacidad() - arg1.verCapacidad();
//            }
//        };
//        ge.mostrarEspacios(cmp);

//        Comparator<Espacio> cmp = (e1, e2) -> e1.verNombre().compareTo(e2.verNombre());
//        ge.mostrarEspacios(cmp);
//        cmp = (e1, e2) -> e1.verCapacidad() - e2.verCapacidad();
        ge.mostrarEspacios((e1, e2) -> e1.verNombre().compareTo(e2.verNombre()));
    }        
}
