/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import docentes.modelos.Dedicacion;
import docentes.modelos.Docente;
import docentes.modelos.ModeloTablaDocentes;
import docentes.vistas.VentanaDocentes;
import java.util.ArrayList;
import javax.swing.UIManager;

/**
 *
 * @author root
 */
public class Main {
    public static void main(String[] args) {
//        JFrame ventana = new JFrame("Mi ventana");
//        ventana.setSize(300, 300);
//        ventana.setLocationRelativeTo(null);
//        ventana.setResizable(false);
//        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        ventana.setVisible(true);

        //VentanaAsignaturas ventana = new VentanaAsignaturas();

//        int opcion = JOptionPane.showConfirmDialog(null,
// 		"¿Desea borrar el espacio especificado?", 
// 		"Reservas", 
// 		JOptionPane.YES_NO_OPTION);
        
        
//        int opcion = JOptionPane.showOptionDialog(null,
//            "¿Desea borrar el espacio especificado?", 
//            "Reservas", JOptionPane.YES_NO_OPTION, 
//            JOptionPane.QUESTION_MESSAGE, null, 
//            new Object[] {"Sí", "No"}, "No"); 


//        JOptionPane.showMessageDialog(null, 
//                "No se puede borrar el espacio", 
//                "Reservas", 
//// 		JOptionPane.INFORMATION_MESSAGE);
        //System.out.println(opcion);
        
        //VentanaAsignaturas2 ventana2 = new VentanaAsignaturas2(null);
        
        Docente d1 = new Docente(1, "Apellido1", "Nombre1", 1, Dedicacion.MEDIA);
        Docente d2 = new Docente(2, "Apellido2", "Nombre2", 2, Dedicacion.SIMPLE);
        Docente d3 = new Docente(3, "Apellido3", "Nombre3", 3, Dedicacion.SIMPLE);
        Docente d4 = new Docente(4, "Apellido4", "Nombre4", 4, Dedicacion.EXCLUSIVA);
        Docente d5 = new Docente(5, "Apellido5", "Nombre5", 5, Dedicacion.MEDIA);
        Docente d6 = new Docente(6, "Apellido6", "Nombre6", 6, Dedicacion.EXCLUSIVA);
        ArrayList<Docente> docentes = new ArrayList<>();
        docentes.add(d1);
        docentes.add(d2);
        docentes.add(d3);
        docentes.add(d4);
        docentes.add(d5);
        docentes.add(d6);
        //d.mostrar();
     
        //VentanaMDocente ventana = new VentanaMDocente(null, d1);
        asignarLookAndFeel("Nimbus");
        ModeloTablaDocentes mtd = new ModeloTablaDocentes(docentes);
        VentanaDocentes ventana = new VentanaDocentes(null, mtd);
    }
    
    public static void asignarLookAndFeel(String laf) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } 
            catch (Exception e2) {
            }
        }
    }    
}
