/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlloRegistrazione;
import LoginForm.*;
import javax.swing.*;

public class ControlloNome {
   
    private boolean cont = false;
    public void CN(String n, JLabel Ln) {
        if(n.equals("")) {
            Ln.setVisible(true);
            Ln.setText("Inserire Nome");
        } else {
           Ln.setVisible(false); 
           cont = true;
        }
        
    }
    
    public boolean n() {
        return cont;
    }
}
