/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docentes.modelos;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author root
 */
public class ModeloComboDedicacion extends DefaultComboBoxModel {
    public ModeloComboDedicacion() {
        for (Dedicacion d : Dedicacion.values()) {
            this.addElement(d);
        }
    }
    
    public Dedicacion obtenerDedicacion() {
        return (Dedicacion)this.getSelectedItem();
    }
    
    public void seleccionarDedicacion(Dedicacion d) {
        this.setSelectedItem(d);
    }
}
