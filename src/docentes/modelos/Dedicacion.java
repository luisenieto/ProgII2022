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
public enum Dedicacion {
    SIMPLE("Simple"),
    MEDIA("Media"),
    EXCLUSIVA("Exclusiva");
    
    private String valor;
    
    private Dedicacion(String valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
//        switch(this) {
//            case SIMPLE : return "Simple";
//            case MEDIA : return "Media";
//            case EXCLUSIVA : return "Exclusiva";
//            default : return "Simple";
//        }
        return this.valor;
    }
}
