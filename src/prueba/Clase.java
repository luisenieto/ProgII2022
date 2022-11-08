/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.io.IOException;

/**
 *
 * @author root
 */
public class Clase {
    private boolean condicion = false;
    
    public void m1() throws IOException {
        if(condicion) {
            throw new IOException();
        }
    }
    
    
    public void m2() throws IOException {
        
            this.m1();
                
    }
    
    public void m3() {
        try {
            this.m2();
        }
        catch(IOException e) {
            
        }
    }
}
