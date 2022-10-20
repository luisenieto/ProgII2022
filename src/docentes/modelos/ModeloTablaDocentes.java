/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docentes.modelos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root
 */
public class ModeloTablaDocentes extends AbstractTableModel {
    public static final String LEGAJO = "Legajo";
    public static final String APELLIDOS = "Apellidos";
    public static final String NOMBRES = "Nombres";
    public static final String DNI = "DNI";
    public static final String DEDICACION = "Dedicación";
    
    private ArrayList<String> nombresColumnas = new ArrayList<>();
    private ArrayList<Docente> docentes = new ArrayList<>();
    
    public ModeloTablaDocentes(ArrayList<Docente> docentes) {
        this.docentes = docentes;
        this.nombresColumnas.add(LEGAJO);
        this.nombresColumnas.add(APELLIDOS);
        this.nombresColumnas.add(NOMBRES);
        this.nombresColumnas.add(DNI);
        this.nombresColumnas.add(DEDICACION);
    }
    

    @Override
    public int getRowCount() {
        return this.docentes.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.size();
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Docente d = this.docentes.get(fila);
        switch(columna) {
            case 0: return Integer.toString(d.getLegajo());
            case 1: return d.getApellido();
            case 2: return d.getNombre();
            case 3: return Integer.toString(d.getDni());
            case 4: return d.getDedicacion();
            default: return Integer.toString(d.getLegajo());
        }
    }

    @Override
    public String getColumnName(int columna) {
        return this.nombresColumnas.get(columna);
    }
    
    public Docente verDocente(int fila) {
        if (fila >= 0 && fila < this.docentes.size())
            return this.docentes.get(fila);
        else
            return null;
    }
    
}
