

package ControlloRegistrazione;
import LoginForm.*;
import javax.swing.*;

public class ControlloCognome {
   
    public boolean cont = false;
    public void CC(String n, JLabel Lc) {
          if(n.equals("")) {
            Lc.setVisible(true);
            Lc.setText("Inserire Cognome");
        } else {
           Lc.setVisible(false); 
           cont = true;
        }
        
    }

     public boolean c() {
         return cont;
     }       
}
