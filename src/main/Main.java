/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import asignaturas.vistas.VentanaAsignaturas;
import asignaturas.vistas.VentanaAsignaturas2;

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

        VentanaAsignaturas ventana = new VentanaAsignaturas();

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
// 		JOptionPane.INFORMATION_MESSAGE);
        //System.out.println(opcion);
        
        VentanaAsignaturas2 ventana2 = new VentanaAsignaturas2(null);
        
        
    }    
}
