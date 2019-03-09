
package ControlloRegistrazione;
import javax.swing.JLabel;

public class ControlloPassword {
  private boolean cont = false;
   
  public void CP(String n, JLabel Lp) {
        if(n.equals("")) {
            Lp.setVisible(true);
            Lp.setText("Inserire Password");
        } else {
           Lp.setVisible(false); 
           cont = true;
        }
        
    }
    
    public boolean p() {
        return cont;
    }  
}
