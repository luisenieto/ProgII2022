/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espacios.modelos;

import interfaces.IGestorEspacios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
        this.leer();
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
                    String resultado = this.escribir();
                    return (resultado.equals(IGestorEspacios.ESCRITURA_EXITO) ? IGestorEspacios.EXITO : resultado);
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
    
    public static final String NOMBRE_ARCHIVO = "Espacios.txt";
    public static final char SEPARADOR = ',';
    
    private String escribir() {
        File file = new File(NOMBRE_ARCHIVO);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(Espacio e : this.espacios) {
                String cadena;
                cadena = e.verNombre() + SEPARADOR;
                cadena += Integer.toString(e.verCapacidad()) + SEPARADOR;
                cadena += e.verTipo();
                bw.write(cadena);
                bw.newLine();
            }
            bw.close();
            return IGestorEspacios.ESCRITURA_EXITO;
        }
        catch(IOException e) {
            return IGestorEspacios.ESCRITURA_ERROR;
        }        
    }
    
    //sin recursos
//    private String leer() {
//        File file = new File(NOMBRE_ARCHIVO);
//        try {
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String cadena;
//            try {
//                while((cadena = br.readLine()) != null) {
//                    String[] vectorEspacio = cadena.split(Character.toString(SEPARADOR));
//                    String nombre = vectorEspacio[0];
//                    int capacidad = Integer.parseInt(vectorEspacio[1]);
//                    String tipo = vectorEspacio[2];
//                    this.espacios.add(new Espacio(nombre, capacidad, tipo));
//                }
//                br.close();
//                return IGestorEspacios.LECTURA_EXITO;
//            }
//            catch(IOException ioe) {
//                return IGestorEspacios.LECTURA_ERROR;
//            }
//        }
//        catch(FileNotFoundException fnfe) {
//            return IGestorEspacios.ARCHIVO_NO_ENCONTRADO;
//        }        
//    }

    //con recursos
    private String leer() {
        File file = new File(NOMBRE_ARCHIVO);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String cadena;
            while((cadena = br.readLine()) != null) {
                String[] vectorEspacio = cadena.split(Character.toString(SEPARADOR));
                String nombre = vectorEspacio[0];
                int capacidad = Integer.parseInt(vectorEspacio[1]);
                String tipo = vectorEspacio[2];
                this.espacios.add(new Espacio(nombre, capacidad, tipo));
            }
            br.close();
            return IGestorEspacios.LECTURA_EXITO;
        }  
        catch(FileNotFoundException  fnfe) {
            return IGestorEspacios.ARCHIVO_NO_ENCONTRADO;
        }
        catch(IOException ioe) {
            
            return IGestorEspacios.LECTURA_ERROR;
        }
        
    }

}
